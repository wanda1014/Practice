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

    @Autowired
    private ScoreVoMapper scoreVoMapper;

    @Override
    public List<ScoreVo> findAllScore() {
        return scoreVoMapper.findAllScore();
    }

    @Override
    public ScoreVo findScoreById(String studentId) {
        return scoreVoMapper.findScoreById(studentId);
    }

    @Override
    public void updateScore(ScoreVo scoreVo) {
        scoreVoMapper.updateScore(scoreVo);
    }

    @Override
    public List<ScoreVo> findScoreByChinese() {
        return scoreVoMapper.findScoreByChinese();
    }

    @Override
    public List<ScoreVo> chineseUp() {
        return scoreVoMapper.chineseUp();
    }

    @Override
    public int chineseAvg() {
        return scoreVoMapper.chineseAvg();
    }
}
