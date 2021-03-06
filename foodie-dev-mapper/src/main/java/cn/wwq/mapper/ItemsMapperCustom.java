package cn.wwq.mapper;

import cn.wwq.my.mapper.MyMapper;
import cn.wwq.pojo.Items;
import cn.wwq.pojo.vo.ItemCommentVO;
import cn.wwq.pojo.vo.SearchItemsVO;
import cn.wwq.pojo.vo.ShopcartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsMapperCustom{

    public List<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String,Object> map);

    public List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String,Object> map);

    public List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String,Object> map);

    public List<ShopcartVO> queryItemBySpecIds(@Param("paramsList") List specIdsList);

    public int decreaseItemSpecStock(@Param("pendingCounts") Integer pendingCounts,
                                     @Param("specId") String specId);



}