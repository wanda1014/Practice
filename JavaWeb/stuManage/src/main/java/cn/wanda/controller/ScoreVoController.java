package cn.wanda.controller;

import cn.wanda.entity.ScoreVo;
import cn.wanda.service.ScoreVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 分数的controller
 */

@Controller
@RequestMapping("score")    //区分url的工作空间
public class ScoreVoController {

    //注入scoreVoService
    @Autowired
    private ScoreVoService scoreVoService;

    //成绩管理的主页，默认查询所有的记录
    @RequestMapping("index")
    public String index(Model model){

        //查询所有学生的成绩
        List<ScoreVo> scoreVoList = scoreVoService.findAllScore();
        //将scoreVoList存到 model 中，从而达到与页面的交互
        model.addAttribute("scoreVoList",scoreVoList);

        return "score/scoreIndex";      //springmvc配置中，配置了前缀和后缀
    }

    //跳转到修改页面
    @RequestMapping("editPage")
    public String editPage(String studentId, Model model){
        ScoreVo scoreVo = scoreVoService.findScoreById(studentId);
        model.addAttribute("scoreVo",scoreVo);
        return "score/edit";
    }

    //提交修改
    @RequestMapping("edit")
    public String edit(ScoreVo scoreVo){
        //接收页面的数据，存入ScoreVo对象中,自动接收
        /*String chinese = request.getParameter("chinese");
        String math = request.getParameter("math");
        String english = request.getParameter("english");
        scoreVo.setChinese(Integer.parseInt(chinese));
        scoreVo.setMath(Integer.parseInt(math));
        scoreVo.setEnglish(Integer.parseInt(english));*/

        //更新数据
        scoreVoService.updateScore(scoreVo);

        return "redirect:index.action";
    }

    //根据语文成绩降序查找所有信息
    @RequestMapping("findScoreByChinese")
    public String findScoreByChinese(Model model){
        List<ScoreVo> scoreVoList = scoreVoService.findScoreByChinese();
        model.addAttribute("scoreVoList",scoreVoList);
        return "score/scoreIndex";
    }

    //语文成绩大于70分
    @RequestMapping("chineseUp")
    public String chineseUp(Model model){
        //查找
        List<ScoreVo> scoreVoList = scoreVoService.chineseUp();
        model.addAttribute("scoreVoList",scoreVoList);
        return "score/scoreIndex";
    }

    //语文成绩平均值计算
    @RequestMapping("chineseAver")
    public String chineseAvg(Model model){
        int avg = scoreVoService.chineseAvg();
        model.addAttribute("avg",avg);
        return "forward:index.action";
    }

    //按照输入区间排序(暂仅实现语文)
    @RequestMapping("findScoreByRange")
    public String findScoreByRange(HttpServletRequest request,Model model){
        String minStr = request.getParameter("min").trim();
        String maxStr = request.getParameter("max").trim();
        int min = Integer.parseInt(minStr);
        int max = Integer.parseInt(maxStr);

        List<ScoreVo> scoreVoList = scoreVoService.findScoreByRange(min,max);
        model.addAttribute("scoreVoList",scoreVoList);
        model.addAttribute("min",min);
        model.addAttribute("max",max);

        return "score/scoreIndex";
    }

}
