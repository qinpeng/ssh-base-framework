<#-- // Fields -->

<#foreach field in pojo.getAllPropertiesIterator()>
	<#foreach column in field.columnIterator>
   		<#if column.comment?exists && column.comment?trim?length!=0 && (column.comment?index_of("ENUM") > -1)>
   		public static enum ${field.name}{
   			<#assign seq = column.comment.substring((column.comment?index_of("(") +1), column.comment?index_of(").")).split(",")>
   			<#list seq as x>
				${x}<#if x_has_next>,<#else>;</#if>
			</#list>  
   		}
	 	</#if>
 	</#foreach>
</#foreach>
