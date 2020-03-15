/**
 * 
 */
package org.yelong.labbol.core.model.support.generator.extjs;

import java.io.File;

import org.yelong.core.model.resolve.ModelAndTable;

/**
 * @author PengFei
 * @date 2020年3月15日下午2:33:37
 * @since 1.0
 */
public interface ExtjsGenerator {
	
	void generate(ModelAndTable modelAndTable , File jsFile) throws ExtjsGenerateException;
	
}
