/**
 * 
 */
package org.yelong.labbol.core.model.support.generator.jsp;

import java.io.File;

import org.yelong.core.model.Model;

/**
 * @author PengFei
 * @date 2020年3月15日下午3:51:35
 * @since 1.0
 */
public interface JSPGenerator {
	
	void generate(Class<? extends Model> modelClass , File jspFile) throws JSPGenerateException;
	
}
