package cn.wanda.mapper;

import cn.wanda.entity.ScoreVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分数的mapper
 */

public interface ScoreVoMapper {

    //查询所有
    List<ScoreVo> findAllScore();

    //根据学号查询
    ScoreVo findScoreById(@Param("studentId") String studentId);

    //修改信息
    void updateScore(ScoreVo scoreVo);

    //语文成绩降序
    List<ScoreVo> findScoreByChinese();

    //语文成绩大于70
    List<ScoreVo> chineseUp();

    //语文成绩平均分
    int chineseAvg();
}
