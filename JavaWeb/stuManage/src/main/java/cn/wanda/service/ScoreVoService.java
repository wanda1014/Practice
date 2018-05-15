package cn.wanda.service;

import cn.wanda.entity.ScoreVo;

import java.util.List;

/**
 * 分数的service接口
 */

public interface ScoreVoService {
    List<ScoreVo> findAllScore();

    ScoreVo findScoreById(String studentId);

    void updateScore(ScoreVo scoreVo);

    List<ScoreVo> findScoreByChinese();

    List<ScoreVo> chineseUp();

    int chineseAvg();
}
