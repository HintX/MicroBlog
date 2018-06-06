package microBlog.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Datum;

@Repository
public interface DatumMapper {
	Datum gerenziliao(@Param("userId")int userId);
}
