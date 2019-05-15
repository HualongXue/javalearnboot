<div>
	<span>Boot Test</span><br />
        <table >
            <#list users as u>
                <tr>
                    <td>${u.id}</td>
                    <td>${u.uname}</td>
                    <td>${u.uage?c}</td>
                    <td>
                    <form action="?" id="formdel${u.id}" name="formdel${u.id}" method="post">
                        <input type="hidden" name="uid" value="${u.id}" />
                        <input id="${u.id}" name="del" type="button" onclick="subMitDel(${u.id})" value="Del" />
                    <form>
                    </td>
                </tr>
            </#list>
        </table>
</div>

<script type="text/javascript" language="javascript">
function subMitDel(uid)
{
    alert(uid);
    $('formdel"uid"').action="/deleteUserInfo";
    $('formdel"uid"').submit();
}
</script>