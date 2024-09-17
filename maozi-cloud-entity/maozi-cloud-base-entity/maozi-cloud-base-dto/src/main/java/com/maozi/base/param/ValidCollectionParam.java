package com.maozi.base.param;

import com.maozi.base.AbstractBaseDtomain;
import java.util.Collection;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidCollectionParam<T> extends AbstractBaseDtomain {
	
    @Valid
    private Collection<T> list;
    
}