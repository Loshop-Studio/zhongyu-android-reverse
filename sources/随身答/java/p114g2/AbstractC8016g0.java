package p114g2;

import p176m2.AbstractC8958g;

/* renamed from: g2.g0 */
/* loaded from: classes4.dex */
public abstract class AbstractC8016g0 {

    /* renamed from: a */
    public static final String f13528a = "事件属性集合参数为空|onEvent接口必须传入非空的属性集合。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: b */
    public static final String f13530b = "事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: c */
    public static final String f13532c = "事件ID为null或者为空字符串|onEvent接口传入的事件ID不能为null，也不能为空字符串。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: d */
    public static final String f13534d = "事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: e */
    public static final String f13536e = "事件属性集合map中key值和保留字冲突|事件属性集合map中key值不能和保留字冲突。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: f */
    public static final String f13538f = "事件ID为null或者长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: g */
    public static final String f13540g = "事件属性集合参数为空或者事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: h */
    public static final String f13542h = "事件属性集合map中key非法|事件属性集合参数map中key不能为非法的。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: i */
    public static final String f13544i = "事件属性集合map中value为null|事件属性集合参数map中value不能为null。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: j */
    public static final String f13546j = "事件属性集合map中value长度超过限制|事件属性集合参数map中value如果为字符串时，其长度不能超过256个字符。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: k */
    public static final String f13548k = "事件标签为null或者为空字符串|onEvent接口传入的事件标签不能为null，也不能为空字符串。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: l */
    public static final String f13549l = "事件ID为null或者长度超过限制，或事件标签长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。事件标签长度不能超过256个字符。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: m */
    public static final String f13550m = "事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 " + AbstractC8958g.m14290a("66946");

    /* renamed from: n */
    public static final String f13551n = "MobclickAgent.onResume接口参数不能为null|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 " + AbstractC8958g.m14290a("66948");

    /* renamed from: o */
    public static final String f13552o = "MobclickAgent.onResume接口参数不是Activity的上下文|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 " + AbstractC8958g.m14290a("66948");

    /* renamed from: p */
    public static final String f13553p = "MobclickAgent.onPause接口参数不能为null|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 " + AbstractC8958g.m14290a("66948");

    /* renamed from: q */
    public static final String f13554q = "MobclickAgent.onPause接口参数不是Activity的上下文|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 " + AbstractC8958g.m14290a("66948");

    /* renamed from: r */
    public static final String f13555r = "@ 遗漏了Mobclick.onResume函数调用|每个Activity的onResume中都必须调用MobclickAgent.onResume。详见问题链接 " + AbstractC8958g.m14290a("66948");

    /* renamed from: s */
    public static final String f13556s = "@ 遗漏了Mobclick.onPaused函数调用|每个Activity的onPaused中都必须调用MobclickAgent.onPaused。详见问题链接 " + AbstractC8958g.m14290a("66948");

    /* renamed from: t */
    public static final String f13557t = "MobclickAgent.onProfileSignIn接口参数 账号ID 不能为null|账号ID不能为空。详见问题链接 " + AbstractC8958g.m14290a("66951");

    /* renamed from: u */
    public static final String f13558u = "MobclickAgent.onProfileSignIn接口参数 账号ID 长度超过限制|账号ID 长度不能超过64个字符。详见问题链接 " + AbstractC8958g.m14290a("66951");

    /* renamed from: v */
    public static final String f13559v = "MobclickAgent.onProfileSignIn接口参数 账号来源 长度超过限制|账号来源 长度不能超过32个字符。详见问题链接 " + AbstractC8958g.m14290a("66951");

    /* renamed from: w */
    public static final String f13560w = "MobclickAgent.reportError方法参数context不能为null|参数Context需要指定ApplicationContext值。详见问题链接 " + AbstractC8958g.m14290a("66971");

    /* renamed from: x */
    public static final String f13561x = "MobclickAgent.reportError方法参数error不能为null，也不能为空字符串。|error参数必须是非空字符串。详见问题链接 " + AbstractC8958g.m14290a("66971");

    /* renamed from: y */
    public static final String f13562y = "MobclickAgent.reportError方法 Context和Throwable参数都不能为空。|参数Context需要指定ApplicationContext值，Throwable参数传入捕获到的异常对象。详见问题链接 " + AbstractC8958g.m14290a("66971");

    /* renamed from: z */
    public static final String f13563z = "MobclickAgent.onPageStart方法参数不能为null，也不能为空字符串。|参数viewName必须为非空字符串。详见链接 " + AbstractC8958g.m14290a("66975");

    /* renamed from: A */
    public static final String f13502A = "MobclickAgent.onPageEnd方法参数不能为null，也不能为空字符串。|参数viewName必须为非空 字符串。详见链接 " + AbstractC8958g.m14290a("66975");

    /* renamed from: B */
    public static final String f13503B = "对于页面@，onPageStart和onPageEnd调用对的参数不一致。|对于同一个页面，请先调用onPageStart，再调用onPageEnd。详见链接 " + AbstractC8958g.m14290a("66975");

    /* renamed from: C */
    public static final String f13504C = "对于页面@，请确保先依序成对调用onPageStart，onPageEnd接口，再调用onPageStart接口对其它页面进行统计。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 " + AbstractC8958g.m14290a("66975");

    /* renamed from: D */
    public static final String f13505D = "对于页面@，请检查是否遗漏onPageStart接口调用。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 " + AbstractC8958g.m14290a("66975");

    /* renamed from: E */
    public static final String f13506E = "当前发送策略为：启动时发送。详见链接 " + AbstractC8958g.m14290a("66976");

    /* renamed from: F */
    public static final String f13507F = "当前发送策略为: 间隔发送。间隔时间为：@秒。详见链接 " + AbstractC8958g.m14290a("66976");

    /* renamed from: G */
    public static final String f13508G = "当前发送策略为: 集成测试。但是SDK未切换到调试模式，所以后台设置未生效。|如想切换到集成测试发送策略，请调用UMConfigure.setLogEnabled(true)将SDK切换到调试模式。详见链接 " + AbstractC8958g.m14290a("66976");

    /* renamed from: H */
    public static final String f13509H = "当前发送策略为：集成测试。详见链接 " + AbstractC8958g.m14290a("66976");

    /* renamed from: I */
    public static final String f13510I = "当前发送策略为: 准实时发送。间隔时间为：@秒。详见链接 " + AbstractC8958g.m14290a("66976");

    /* renamed from: J */
    public static final String f13511J = "发送数据时发生java.net.UnknownHostException异常|友盟后端对设备端证书验证失败。请确保设备端没有运行抓包代理类程序。详见链接 " + AbstractC8958g.m14290a("66978");

    /* renamed from: K */
    public static final String f13512K = "发送数据时发生javax.net.sslHandshakeException异常|导致友盟后端域名解析失败。请检查系统DNS服务器配置是否正确。详见链接 " + AbstractC8958g.m14290a("66978");

    /* renamed from: L */
    public static final String f13513L = "track接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: M */
    public static final String f13514M = "registerSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: N */
    public static final String f13515N = "unregisterSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: O */
    public static final String f13516O = "getSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接: " + AbstractC8958g.m14290a("67310");

    /* renamed from: P */
    public static final String f13517P = "getSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: Q */
    public static final String f13518Q = "clearSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: R */
    public static final String f13519R = "setFirstLaunchEvent接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: S */
    public static final String f13520S = "registerPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: T */
    public static final String f13521T = "unregisterPreProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: U */
    public static final String f13522U = "clearPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: V */
    public static final String f13523V = "getPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + AbstractC8958g.m14290a("67310");

    /* renamed from: W */
    public static final String f13524W = "eventName为空，请检查|eventName参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67311");

    /* renamed from: X */
    public static final String f13525X = "请注意：map为空|track接口的参数说明，详见问题连接：" + AbstractC8958g.m14290a("67311");

    /* renamed from: Y */
    public static final String f13526Y = "context参数为空｜context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67312");

    /* renamed from: Z */
    public static final String f13527Z = "propertyName参数或propertyValue参数为空｜propertyName、propertyValue参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67312");

    /* renamed from: a0 */
    public static final String f13529a0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67313");

    /* renamed from: b0 */
    public static final String f13531b0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67316");

    /* renamed from: c0 */
    public static final String f13533c0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67318");

    /* renamed from: d0 */
    public static final String f13535d0 = "trackID参数为空|trackID参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67318");

    /* renamed from: e0 */
    public static final String f13537e0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67319");

    /* renamed from: f0 */
    public static final String f13539f0 = "propertics参数为空|propertics参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67319");

    /* renamed from: g0 */
    public static final String f13541g0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67320");

    /* renamed from: h0 */
    public static final String f13543h0 = "未匹配到您传入的property参数|property参数不能匹配，" + AbstractC8958g.m14290a("67320");

    /* renamed from: i0 */
    public static final String f13545i0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67321");

    /* renamed from: j0 */
    public static final String f13547j0 = "context参数为空|context参数不能为空，详见问题连接：" + AbstractC8958g.m14290a("67322");
}
