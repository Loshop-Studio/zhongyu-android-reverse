.class public final Lcom/zykj/blackboard/core/canvas/control/GraphControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/canvas/control/IGraphControl;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ)\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J!\u0010*\u001a\u00020\u000f2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008-\u0010.J9\u00103\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010 2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u00085\u00106J\u001d\u00109\u001a\u00020\u000f2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020(07H\u0016\u00a2\u0006\u0004\u00089\u0010:J%\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020(07H\u0016\u00a2\u0006\u0004\u0008;\u0010<J\u001d\u0010>\u001a\u00020\u000f2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020(0=H\u0016\u00a2\u0006\u0004\u0008>\u0010:J%\u0010?\u001a\u00020\u000f2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020(0=2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\'\u0010A\u001a\u00020\u000f2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020(0=2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0004\u0008A\u0010@J\u000f\u0010B\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008B\u00106J\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0019\u0010E\u001a\u00020\u000f2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0004\u0008E\u0010DJ\u000f\u0010F\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008F\u00106J\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020GH\u0016\u00a2\u0006\u0004\u0008H\u0010IJ+\u0010L\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020G2\u0008\u0010J\u001a\u0004\u0018\u00010\n2\u0008\u0010K\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0004\u0008L\u0010MJ+\u0010N\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020G2\u0008\u0010J\u001a\u0004\u0018\u00010\n2\u0008\u0010K\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0004\u0008N\u0010MJ\u001f\u0010O\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008O\u0010PJ\u000f\u0010Q\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008Q\u00106J\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008S\u0010TJ\u0017\u0010U\u001a\u00020\u000f2\u0006\u0010U\u001a\u000201H\u0016\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010U\u001a\u000201H\u0016\u00a2\u0006\u0004\u0008U\u0010WJ\u001f\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020&2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008Y\u0010ZJ\u000f\u0010[\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008[\u0010\u000cJ\u0017\u0010^\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\\H\u0016\u00a2\u0006\u0004\u0008^\u0010_J\u0017\u0010`\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\\H\u0016\u00a2\u0006\u0004\u0008`\u0010_J\u000f\u0010a\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008a\u00106J\u000f\u0010b\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008b\u00106J\u000f\u0010c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008c\u00106J\u0011\u0010d\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0004\u0008d\u0010eJ\u0011\u0010R\u001a\u0004\u0018\u00010(H\u0016\u00a2\u0006\u0004\u0008R\u0010fJ\u0017\u0010g\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008g\u0010\u0015J\u000f\u0010h\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008h\u0010\u0017J\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008i\u0010\u001bJ\u000f\u0010j\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008j\u0010\u001dJ\u000f\u0010k\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008k\u00106J\u0011\u0010m\u001a\u0004\u0018\u00010lH\u0016\u00a2\u0006\u0004\u0008m\u0010nJ\u0011\u0010p\u001a\u0004\u0018\u00010oH\u0016\u00a2\u0006\u0004\u0008p\u0010qJ\u0011\u0010r\u001a\u0004\u0018\u00010oH\u0016\u00a2\u0006\u0004\u0008r\u0010qJS\u0010{\u001a\u0004\u0018\u00010o2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u00122\u0006\u0010v\u001a\u00020\u00122\u0006\u0010w\u001a\u0002012\u0006\u0010x\u001a\u0002012\u0006\u0010y\u001a\u0002012\u0008\u0010z\u001a\u0004\u0018\u00010(H\u0016\u00a2\u0006\u0004\u0008{\u0010|J\u001d\u0010}\u001a\u00020\u000f2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020(0=H\u0016\u00a2\u0006\u0004\u0008}\u0010:J2\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020&2\u0006\u0010~\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u007f\u001a\u00020\nH\u0016\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J4\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\"2\u0007\u0010\u0083\u0001\u001a\u00020&H\u0016\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u0012H\u0016\u00a2\u0006\u0005\u0008\u0086\u0001\u0010\u0017J6\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u0087\u0001\u001a\u00020/2\u0007\u0010\u0088\u0001\u001a\u00020/2\u0007\u0010\u0089\u0001\u001a\u00020/2\u0007\u0010\u008a\u0001\u001a\u00020/H\u0016\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\\\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001Jf\u0010\u009b\u0001\u001a\u00020\u000f2\u0008\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u009c\u0001Jf\u0010\u009d\u0001\u001a\u00020\u000f2\u0008\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016\u00a2\u0006\u0006\u0008\u009d\u0001\u0010\u009c\u0001J\\\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u0098\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u000fH\u0002\u00a2\u0006\u0005\u0008\u009f\u0001\u00106R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u00a0\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u00a1\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u00a2\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008R\u0010\u00a3\u0001R\u001a\u0010\u00a5\u0001\u001a\u00030\u00a4\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008J\u0010\u00a7\u0001R\u0017\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008#\u0010\u00a8\u0001R\u0017\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u00082\u0010\u00a9\u0001R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008!\u0010\u00aa\u0001R\u0017\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u00080\u0010\u00ab\u0001R\u0017\u0010U\u001a\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008U\u0010\u00a9\u0001R\u0019\u0010\u00ac\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\u0017\u0010\u00ae\u0001\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R8\u0010\u00b1\u0001\u001a\u0011\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00b0\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001\u001a\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001\"\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001R\u0018\u0010\u00b8\u0001\u001a\u00030\u00b7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001\u00a8\u0006\u00ba\u0001"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "renderLayer",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "<init>",
        "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V",
        "Landroid/graphics/RectF;",
        "getPageRectF",
        "()Landroid/graphics/RectF;",
        "getOldPageRectF",
        "rectF",
        "Ld6/s;",
        "setOldPageRectF",
        "(Landroid/graphics/RectF;)V",
        "",
        "color",
        "setDefaultBackgroundColor",
        "(I)V",
        "getDefaultBackgroundColor",
        "()I",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "backgroundLineConfig",
        "setDefaultBackgroundLineConfig",
        "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V",
        "getDefaultBackgroundLineConfig",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "Landroid/graphics/Path;",
        "path",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Matrix;",
        "matrix",
        "drawPath",
        "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V",
        "",
        "parentId",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graph",
        "addGraph",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "addImageGraph",
        "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V",
        "",
        "iconWidth",
        "",
        "isSelectAction",
        "select",
        "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V",
        "selectCancel",
        "()V",
        "",
        "graphList",
        "delete",
        "(Ljava/util/List;)V",
        "renderRectF",
        "(Landroid/graphics/RectF;Ljava/util/List;)V",
        "",
        "translationStart",
        "translation",
        "(Ljava/util/List;Landroid/graphics/Matrix;)V",
        "translationEnd",
        "cameraChangeStart",
        "cameraChanging",
        "(Landroid/graphics/Matrix;)V",
        "cameraChangeEnd",
        "resetCamera",
        "Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "textHandleStart",
        "(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V",
        "selectedRectF",
        "selectedRectFMatrix",
        "textHandle",
        "(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V",
        "textHandleEnd",
        "concatMatrix",
        "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V",
        "release",
        "rootGraph",
        "init",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "isDraw",
        "(Z)V",
        "()Z",
        "graphId",
        "setGraphMatrix",
        "(Ljava/lang/String;Landroid/graphics/Matrix;)V",
        "getRenderRectF",
        "Lcom/zykj/blackboard/core/edit/RenderChangeListener;",
        "listener",
        "registerRenderRectFChangeListener",
        "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V",
        "unRegisterRenderRectFChangeListener",
        "refresh",
        "reDrawFixView",
        "reset",
        "rootGraphId",
        "()Ljava/lang/String;",
        "()Lcom/zykj/blackboard/core/graph/IGraph;",
        "updateBackgroundColor",
        "getBackgroundColor",
        "updateBackgroundLineConfig",
        "getBackgroundLineConfig",
        "updateBackgroundMatrix",
        "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
        "snapshot",
        "()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
        "Landroid/graphics/Bitmap;",
        "screenshot",
        "()Landroid/graphics/Bitmap;",
        "contentThumbnail",
        "horizontalOffset",
        "verticalOffset",
        "minWidth",
        "minHeight",
        "isBoardAsWidth",
        "isContainLimit",
        "isBoardAsTop",
        "interruptGraph",
        "minScreenShot",
        "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;",
        "drawGraphInActive",
        "content",
        "originRectF",
        "changeTextGraph",
        "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V",
        "renderMatrix",
        "filePath",
        "changeImageGraph",
        "(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V",
        "getImageGraphCount",
        "l",
        "t",
        "r",
        "b",
        "newSelecting",
        "(FFFF)V",
        "selectRectF",
        "selectFunctionRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
        "functionRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
        "functionBackgroundRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "typeList",
        "Landroid/graphics/PointF;",
        "pointF",
        "newSelect",
        "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V",
        "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
        "groupGraph",
        "newChangeHandleStart",
        "(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V",
        "newChangeHandling",
        "newChangeHandleEnd",
        "resetBackground",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "Lcom/zykj/blackboard/core/canvas/control/DrawControl;",
        "drawControl",
        "Lcom/zykj/blackboard/core/canvas/control/DrawControl;",
        "Landroid/graphics/RectF;",
        "Landroid/graphics/Matrix;",
        "Z",
        "Landroid/graphics/Paint;",
        "F",
        "defaultBackgroundColor",
        "I",
        "defaultBackgroundLineConfig",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "Lkotlin/Function1;",
        "deleteCallback",
        "Lr6/c;",
        "getDeleteCallback",
        "()Lr6/c;",
        "setDeleteCallback",
        "(Lr6/c;)V",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;",
        "newSelectGraphControl",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private defaultBackgroundColor:I

.field private final defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private deleteCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private iconWidth:F

.field private isDraw:Z

.field private isSelectAction:Z

.field private matrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private selectedRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 7
    .param p1    # Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/bean/BoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "matrixAdapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "boardConfig"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 26
    .line 27
    invoke-direct {v0, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;-><init>(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 31
    .line 32
    new-instance p3, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    const/4 p3, 0x1

    .line 40
    iput-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 41
    .line 42
    iput-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 43
    .line 44
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 45
    .line 46
    const/16 v5, 0xf

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/e;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p1, p3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setVisibleRectF(Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 66
    .line 67
    invoke-virtual {p3, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setRenderLayer(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 76
    .line 77
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;-><init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 83
    .line 84
    return-void
.end method

.method private final resetBackground()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundColor:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "GraphControl:addGraph -> ["

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "] parentId:"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", graphId:"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/graph/Graph;->addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 74
    .line 75
    .line 76
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 77
    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->add(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    :goto_0
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 88
    .line 89
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 90
    .line 91
    if-nez p1, :cond_5

    .line 92
    .line 93
    :cond_4
    :goto_1
    return-void

    .line 94
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->add(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V
    .locals 2
    .param p1    # Lcom/zykj/blackboard/core/graph/group/ImageGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "GraphControl:addImageGraph -> graphId:"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraphChange;->addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public cameraChangeEnd(Landroid/graphics/Matrix;)V
    .locals 2
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "GraphControl:cameraChangeEnd"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->cameraMatrixConcat(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChangeEnd(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
.end method

.method public cameraChangeStart()V
    .locals 2

    .line 1
    const-string v0, "GraphControl:cameraChangeStart "

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChangeStart(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public cameraChanging(Landroid/graphics/Matrix;)V
    .locals 3
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChanging(Landroid/graphics/Matrix;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method

.method public changeImageGraph(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "renderMatrix"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "filePath"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "GraphControl:changeImageGraph -> graphId: "

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 59
    .line 60
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 71
    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 75
    .line 76
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeRenderMatrix(Landroid/graphics/Matrix;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p4}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;->updateFilePath(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 92
    .line 93
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 99
    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_1
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInFix(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return-void
.end method

.method public changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paint"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "originRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "GraphControl:changeTextGraph -> graphId: "

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 59
    .line 60
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 71
    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 75
    .line 76
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p3}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 92
    .line 93
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 99
    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_1
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInFix(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 109
    .line 110
    if-eqz v1, :cond_0

    .line 111
    .line 112
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 113
    .line 114
    if-eqz v2, :cond_2

    .line 115
    .line 116
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 117
    .line 118
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 119
    .line 120
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 121
    .line 122
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    goto :goto_1

    .line 127
    :cond_2
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 128
    .line 129
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 130
    .line 131
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 132
    .line 133
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->selectCancel()V

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 143
    .line 144
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 145
    .line 146
    invoke-virtual {v2, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->select(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_3
    return-void
.end method

.method public concatMatrix(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/graph/IGraphChange;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public contentThumbnail()Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->contentThumbnail(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public delete(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "GraphControl:delete -> root:"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, ": "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    invoke-static {p1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 63
    .line 64
    invoke-interface {v4}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->deleteGraphList(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 104
    .line 105
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->deleteCallback:Lr6/c;

    .line 106
    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-interface {v2, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 114
    .line 115
    if-nez p1, :cond_5

    .line 116
    .line 117
    :goto_2
    return-void

    .line 118
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->delete(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public drawGraphInActive(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInActive(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getDefaultBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public getDefaultBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDeleteCallback()Lr6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->deleteCallback:Lr6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImageGraphCount()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 27
    .line 28
    instance-of v2, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v1
.end method

.method public getOldPageRectF()Landroid/graphics/RectF;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getOldPageRectF()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getPageRectF()Landroid/graphics/RectF;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getRenderRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getRenderRectF()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public init(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 4
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "GraphControl:init -> "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ": "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    invoke-static {v1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 55
    .line 56
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 79
    .line 80
    return-void
.end method

.method public isDraw(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    return-void
.end method

.method public isDraw()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    return v0
.end method

.method public minScreenShot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .locals 10
    .param p8    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 6
    .line 7
    move v2, p1

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move v5, p4

    .line 11
    move v6, p5

    .line 12
    move/from16 v7, p6

    .line 13
    .line 14
    move/from16 v8, p7

    .line 15
    .line 16
    move-object/from16 v9, p8

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v9}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getMinScreenShot(Lcom/zykj/blackboard/core/graph/IGraph;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public newChangeHandleEnd(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 10
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "selectRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "selectFunctionRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "functionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "functionBackgroundRectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "typeList"

    .line 27
    .line 28
    move-object/from16 v8, p6

    .line 29
    .line 30
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    move-object v4, p2

    .line 41
    move-object v5, p3

    .line 42
    move-object v6, p4

    .line 43
    move-object v7, p5

    .line 44
    move-object/from16 v9, p7

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->newChangeHandleEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public newChangeHandleStart(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 11
    .param p1    # Lcom/zykj/blackboard/core/graph/group/GroupGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "groupGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "selectFunctionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "functionRectF"

    .line 22
    .line 23
    move-object/from16 v7, p5

    .line 24
    .line 25
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "functionBackgroundRectF"

    .line 29
    .line 30
    move-object/from16 v8, p6

    .line 31
    .line 32
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "typeList"

    .line 36
    .line 37
    move-object/from16 v9, p7

    .line 38
    .line 39
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 47
    .line 48
    move-object v3, p1

    .line 49
    move-object v4, p2

    .line 50
    move-object v5, p3

    .line 51
    move-object v6, p4

    .line 52
    move-object/from16 v10, p8

    .line 53
    .line 54
    invoke-virtual/range {v1 .. v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->newChangeHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method

.method public newChangeHandling(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 10
    .param p1    # Lcom/zykj/blackboard/core/graph/group/GroupGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "groupGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "selectFunctionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "functionRectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "functionBackgroundRectF"

    .line 27
    .line 28
    move-object/from16 v7, p6

    .line 29
    .line 30
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "typeList"

    .line 34
    .line 35
    move-object/from16 v8, p7

    .line 36
    .line 37
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    move-object v3, p2

    .line 48
    move-object v4, p3

    .line 49
    move-object v5, p4

    .line 50
    move-object v6, p5

    .line 51
    move-object/from16 v9, p8

    .line 52
    .line 53
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->newChangeHandling(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "selectRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "selectFunctionRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "functionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "functionBackgroundRectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "typeList"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    move-object v3, p2

    .line 35
    move-object v4, p3

    .line 36
    move-object v5, p4

    .line 37
    move-object v6, p5

    .line 38
    move-object v7, p6

    .line 39
    move-object/from16 v8, p7

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->drawNewSelectRectF(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public newSelecting(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->drawNewSelectRectF(FFFF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized reDrawFixView()V
    .locals 3

    .line 1
    const-string v0, "GraphControl:reDrawFixView -> cameraMatrix="

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInFix(Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw v0
.end method

.method public refresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->refresh()Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/edit/RenderChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    const-string v0, "GraphControl:release"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->onDestroy()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->release()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public renderRectF(Landroid/graphics/RectF;Ljava/util/List;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderRectFInFix(Landroid/graphics/RectF;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    const-string v0, "GraphControl:reset"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->resetBackground()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->onDestroy()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->reset()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public resetCamera()V
    .locals 2

    .line 1
    const-string v0, "GraphControl:resetCamera"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->resetCamera()V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChangeEnd(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-object v0
.end method

.method public rootGraphId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public screenshot()Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->screenshot(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 19
    .line 20
    iput p4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    iput-boolean p5, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-eqz p5, :cond_1

    .line 34
    .line 35
    sget-object p5, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 36
    .line 37
    invoke-virtual {p5, p1, p2, p4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object p5, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 43
    .line 44
    invoke-virtual {p5, p1, p2, p4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->selectCancel()V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 54
    .line 55
    invoke-virtual {p2, p1, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->select(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void
.end method

.method public selectCancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->selectCancel()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setDefaultBackgroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundColor:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 2
    .param p1    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineColor(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineSpace()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineSpace(F)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final setDeleteCallback(Lr6/c;)V
    .locals 0
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->deleteCallback:Lr6/c;

    .line 2
    .line 3
    return-void
.end method

.method public setGraphMatrix(Ljava/lang/String;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "GraphControl:setGraphMatrix -> graphId:"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public setOldPageRectF(Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getOldPageRectF()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getSnapshot()Lcom/zykj/board/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/board/d0;->c()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 2
    .param p1    # Lcom/zykj/blackboard/core/graph/group/TextGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz p2, :cond_2

    .line 12
    .line 13
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 27
    .line 28
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 29
    .line 30
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 40
    .line 41
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p2, 0x0

    .line 47
    :goto_0
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-virtual {p3, p1, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public textHandleEnd(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 2
    .param p1    # Lcom/zykj/blackboard/core/graph/group/TextGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "GraphControl:textHandleEnd"

    .line 7
    .line 8
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 42
    .line 43
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 53
    .line 54
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 p2, 0x0

    .line 60
    :goto_0
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {p3, p1, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandleEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    return-void
.end method

.method public textHandleStart(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 5
    .param p1    # Lcom/zykj/blackboard/core/graph/group/TextGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "GraphControl:textHandleStart"

    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 35
    .line 36
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 37
    .line 38
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 46
    .line 47
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 48
    .line 49
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v1, 0x0

    .line 55
    :goto_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 58
    .line 59
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return-void
.end method

.method public translation(Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "matrix"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->transGraph(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "GraphControl:translationEnd -> matrix:"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " graph:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-static {p1, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 47
    .line 48
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 85
    .line 86
    new-instance v1, Landroid/graphics/Matrix;

    .line 87
    .line 88
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 89
    .line 90
    .line 91
    if-eqz p2, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->concatMatrix(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 101
    .line 102
    if-nez p1, :cond_3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 106
    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 110
    .line 111
    new-instance v0, Landroid/graphics/Matrix;

    .line 112
    .line 113
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 114
    .line 115
    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 132
    .line 133
    .line 134
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 144
    .line 145
    .line 146
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 147
    .line 148
    if-eqz p1, :cond_8

    .line 149
    .line 150
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 151
    .line 152
    if-eqz p2, :cond_7

    .line 153
    .line 154
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    sget-object v0, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 159
    .line 160
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 161
    .line 162
    iget v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 163
    .line 164
    invoke-virtual {v0, p2, v1, v2}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    goto :goto_2

    .line 169
    :cond_6
    sget-object v0, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 170
    .line 171
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 172
    .line 173
    iget v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 174
    .line 175
    invoke-virtual {v0, p2, v1, v2}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    goto :goto_2

    .line 180
    :cond_7
    const/4 p2, 0x0

    .line 181
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 182
    .line 183
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 184
    .line 185
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->transGraphEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_3
    return-void
.end method

.method public translationStart(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "GraphControl:translationStart -> graph:"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {p1, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 39
    .line 40
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 80
    .line 81
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 82
    .line 83
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 84
    .line 85
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 91
    .line 92
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 93
    .line 94
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 95
    .line 96
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/4 v1, 0x0

    .line 102
    :goto_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 103
    .line 104
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 105
    .line 106
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->transGraphStart(Lcom/zykj/blackboard/core/graph/IGraph;Ljava/util/List;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_2
    return-void
.end method

.method public unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/edit/RenderChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public updateBackgroundColor(I)V
    .locals 1

    .line 1
    const-string v0, "GraphControl:updateBackground -> color:"

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundColor(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public updateBackgroundMatrix()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->updateBackgroundMatrix(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
