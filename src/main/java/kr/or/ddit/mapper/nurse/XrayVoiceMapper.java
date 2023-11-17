package kr.or.ddit.mapper.nurse;

import java.util.List;
import java.util.Map;

import kr.or.ddit.common.vo.VoiceOutputVO;

public interface XrayVoiceMapper {

	List<VoiceOutputVO> voiceList();

	int voiceInsert(Map<String, String> map);

	VoiceOutputVO voiceSelect(Map<String, String> map);

	int voiceUpdate(Map<String, String> map);

	int voiceDelete(Map<String, String> map);

}
