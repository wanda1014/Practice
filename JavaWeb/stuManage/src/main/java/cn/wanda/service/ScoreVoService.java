package cn.wanda.service;

import cn.wanda.entity.ScoreVo;

import java.util.List;

/**
 * 分数的service接口
 */

public interface ScoreVoService {

    //查询所有
    List<ScoreVo> findAllScore();

    //根据学号查询
    ScoreVo findScoreById(String studentId);

    //修改信息
    void updateScore(ScoreVo scoreVo);

    //语文成绩降序
    List<ScoreVo> findScoreByChinese();

    //语文成绩大于70
    List<ScoreVo> chineseUp();

    //语文成绩平均分
    int chineseAvg();

    List<ScoreVo> findScoreByRange(int min, int max);
}
