
	public static enum FieldNamesEnum {
	<#list pojo.getPropertiesForFullConstructor() as x>
		${x.name}<#if x_has_next>,<#else>;</#if>
	</#list>  
	}
