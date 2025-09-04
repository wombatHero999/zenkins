package com.kh.guestbook;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
	List<Post> selectAll();

	void insert(Post post);
}
