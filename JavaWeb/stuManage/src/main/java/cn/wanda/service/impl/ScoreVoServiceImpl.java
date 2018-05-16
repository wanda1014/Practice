package cn.wanda.service.impl;

/**
 * 分数service接口的实现
 */

import cn.wanda.entity.ScoreVo;
import cn.wanda.mapper.ScoreVoMapper;
import cn.wanda.service.ScoreVoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScoreVoServiceImpl implements ScoreVoService {

    //注入scoreVoMapper
    @Autowired
    private ScoreVoMapper scoreVoMapper;

    //查询所有
    @Override
    public List<ScoreVo> findAllScore() {
        return scoreVoMapper.findAllScore();
    }

    //根据学号查询
    @Override
    public ScoreVo findScoreById(String studentId) {
        return scoreVoMapper.findScoreById(studentId);
    }

    //修改信息
    @Override
    public void updateScore(ScoreVo scoreVo) {
        scoreVoMapper.updateScore(scoreVo);
    }

    //语文成绩降序
    @Override
    public List<ScoreVo> findScoreByChinese() {
        return scoreVoMapper.findScoreByChinese();
    }

    //语文成绩大于70
    @Override
    public List<ScoreVo> chineseUp() {
        return scoreVoMapper.chineseUp();
    }

    //语文成绩平均分
    @Override
    public int chineseAvg() {
        return scoreVoMapper.chineseAvg();
    }

    @Override
    public List<ScoreVo> findScoreByRange(int min, int max) {
        return scoreVoMapper.findScoreByRange(min,max);
    }
}
