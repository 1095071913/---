package com.maozi.base.result;

import com.maozi.base.AbstractBaseVomain;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<D> extends AbstractBaseVomain {
	
	@Schema(description = "页数")
	private Long current;
	
	@Schema(description = "每页数量")
	private Long size;

	@Schema(description = "数据总数")
	private Long total;
	
	@Valid
	private List<D> data;

}