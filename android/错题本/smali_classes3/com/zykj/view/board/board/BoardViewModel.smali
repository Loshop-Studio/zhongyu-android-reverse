.class public final Lcom/zykj/view/board/board/BoardViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/BoardViewModel$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u000c\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0008\u0008\u0002\u0010%\u001a\u00020\u000c\u00a2\u0006\u0004\u0008&\u0010$J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u000c\u00a2\u0006\u0004\u0008(\u0010$J\u0015\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,J\r\u0010-\u001a\u00020\u0007\u00a2\u0006\u0004\u0008-\u0010\u0003J\r\u0010.\u001a\u00020\u0007\u00a2\u0006\u0004\u0008.\u0010\u0003J\r\u0010/\u001a\u00020\u0007\u00a2\u0006\u0004\u0008/\u0010\u0003J\r\u00100\u001a\u00020\u0007\u00a2\u0006\u0004\u00080\u0010\u0003J\r\u00101\u001a\u00020\u0007\u00a2\u0006\u0004\u00081\u0010\u0003J\r\u00102\u001a\u00020\u0007\u00a2\u0006\u0004\u00082\u0010\u0003J\r\u00103\u001a\u00020\u0007\u00a2\u0006\u0004\u00083\u0010\u0003J\u0015\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\u00086\u00107J\u0015\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208\u00a2\u0006\u0004\u0008:\u0010;J\u0015\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008@\u0010?J\u0015\u0010B\u001a\u00020\u00072\u0006\u0010A\u001a\u00020<\u00a2\u0006\u0004\u0008B\u0010?J\r\u0010C\u001a\u00020\u0007\u00a2\u0006\u0004\u0008C\u0010\u0003J\r\u0010D\u001a\u00020\u0007\u00a2\u0006\u0004\u0008D\u0010\u0003J\r\u0010E\u001a\u00020\u0007\u00a2\u0006\u0004\u0008E\u0010\u0003J\r\u0010F\u001a\u00020\u0007\u00a2\u0006\u0004\u0008F\u0010\u0003J\r\u0010G\u001a\u00020\u0007\u00a2\u0006\u0004\u0008G\u0010\u0003J\u0015\u0010H\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008H\u0010?J\u0015\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I\u00a2\u0006\u0004\u0008K\u0010LJ]\u0010W\u001a\u00020\u00072\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010O2\u0008\u0008\u0002\u0010R\u001a\u00020Q2\u0008\u0008\u0002\u0010S\u001a\u00020\u000c2\u0008\u0008\u0002\u0010T\u001a\u00020O2\u0018\u0008\u0002\u0010V\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020\u0007\u0018\u00010U\u00a2\u0006\u0004\u0008W\u0010XJ%\u0010[\u001a\u00020\u00072\u000c\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020O0Y2\u0008\u0008\u0002\u0010S\u001a\u00020\u000c\u00a2\u0006\u0004\u0008[\u0010\\J\u0015\u0010^\u001a\u00020\u00072\u0006\u0010]\u001a\u00020O\u00a2\u0006\u0004\u0008^\u0010_J\u0015\u0010`\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008`\u0010?J\r\u0010a\u001a\u00020\u0007\u00a2\u0006\u0004\u0008a\u0010\u0003J%\u0010d\u001a\u00020\u00072\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008d\u0010eJ%\u0010f\u001a\u00020\u00072\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008f\u0010eJ\r\u0010g\u001a\u00020\u0007\u00a2\u0006\u0004\u0008g\u0010\u0003J\u0017\u0010i\u001a\u00020\u00072\u0008\u0008\u0002\u0010h\u001a\u00020\u000c\u00a2\u0006\u0004\u0008i\u0010$J\r\u0010j\u001a\u00020\u0007\u00a2\u0006\u0004\u0008j\u0010\u0003J\u0015\u0010l\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\u000c\u00a2\u0006\u0004\u0008l\u0010$Jm\u0010u\u001a\u00020\u00072\u0008\u0008\u0002\u0010m\u001a\u00020\u000c2\u0008\u0008\u0002\u0010n\u001a\u00020\u000c2$\u0008\u0002\u0010s\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020p\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070q\u0012\u0006\u0012\u0004\u0018\u00010r0o2$\u0008\u0002\u0010t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020O\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070q\u0012\u0006\u0012\u0004\u0018\u00010r0o\u00a2\u0006\u0004\u0008u\u0010vJ\u0013\u0010w\u001a\u0008\u0012\u0004\u0012\u00020O0Y\u00a2\u0006\u0004\u0008w\u0010xJ\u0013\u0010y\u001a\u0008\u0012\u0004\u0012\u00020O0Y\u00a2\u0006\u0004\u0008y\u0010xJ\r\u0010z\u001a\u00020\u0007\u00a2\u0006\u0004\u0008z\u0010\u0003J\u0017\u0010}\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0004\u0008}\u0010~J\u001b\u0010\u0081\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0083\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0082\u0001J\u001b\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0082\u0001J\u001b\u0010\u0086\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0082\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0082\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u0088\u0001\u0010~J\u0019\u0010\u0089\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u0089\u0001\u0010~J\u0019\u0010\u008a\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u008a\u0001\u0010~J\u0019\u0010\u008b\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u008b\u0001\u0010~J\u0019\u0010\u008c\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u008c\u0001\u0010~J\u0019\u0010\u008d\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u008d\u0001\u0010~J\u0019\u0010\u008e\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u008e\u0001\u0010~J\u0019\u0010\u008f\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002\u00a2\u0006\u0005\u0008\u008f\u0001\u0010~J\u0011\u0010\u0090\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0090\u0001\u0010\u0003J\u0011\u0010\u0091\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0091\u0001\u0010\u0003J\u0011\u0010\u0092\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0092\u0001\u0010\u0003J\u0011\u0010\u0093\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0093\u0001\u0010\u0003J\u0011\u0010\u0094\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0094\u0001\u0010\u0003J\u0011\u0010\u0095\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0095\u0001\u0010\u0003J\u0011\u0010\u0096\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0096\u0001\u0010\u0003J\u0011\u0010\u0097\u0001\u001a\u00020\u0007H\u0002\u00a2\u0006\u0005\u0008\u0097\u0001\u0010\u0003J#\u0010\u0099\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u007f2\u0006\u0010A\u001a\u00020<H\u0002\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0017\u0010\u009b\u0001R,\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0005\u0008\u001b\u0010\u009d\u0001\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u00a0\u0001R,\u0010\u00a2\u0001\u001a\u0005\u0018\u00010\u00a1\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001\"\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R,\u0010\u00a9\u0001\u001a\u0005\u0018\u00010\u00a8\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\u001a\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001\"\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R,\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00af\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\"\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001R\u0019\u0010\u00b6\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R\u0018\u0010\u00b9\u0001\u001a\u00030\u00b8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001R\u001f\u0010\u00bd\u0001\u001a\n\u0012\u0005\u0012\u00030\u00bc\u00010\u00bb\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R$\u0010\u00c0\u0001\u001a\n\u0012\u0005\u0012\u00030\u00bc\u00010\u00bf\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001\u001a\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R\u001f\u0010\u00c6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c5\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R$\u0010\u00c9\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c5\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001R\u001f\u0010\u00ce\u0001\u001a\n\u0012\u0005\u0012\u00030\u00cd\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ce\u0001\u0010\u00c7\u0001R$\u0010\u00cf\u0001\u001a\n\u0012\u0005\u0012\u00030\u00cd\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00cf\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00d0\u0001\u0010\u00cc\u0001R\u001f\u0010\u00d2\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d1\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u00c7\u0001R$\u0010\u00d3\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d1\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d3\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00d4\u0001\u0010\u00cc\u0001R\u001f\u0010\u00d6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d5\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0001\u0010\u00c7\u0001R$\u0010\u00d7\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d5\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d7\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00d8\u0001\u0010\u00cc\u0001R\u001f\u0010\u00da\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d9\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0001\u0010\u00c7\u0001R$\u0010\u00db\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d9\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00db\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00dc\u0001\u0010\u00cc\u0001R\u001f\u0010\u00de\u0001\u001a\n\u0012\u0005\u0012\u00030\u00dd\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00c7\u0001R$\u0010\u00df\u0001\u001a\n\u0012\u0005\u0012\u00030\u00dd\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00df\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00e0\u0001\u0010\u00cc\u0001R\u001f\u0010\u00e2\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e1\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e2\u0001\u0010\u00c7\u0001R$\u0010\u00e3\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e1\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e3\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00e4\u0001\u0010\u00cc\u0001R\u001f\u0010\u00e6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e5\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e6\u0001\u0010\u00c7\u0001R$\u0010\u00e7\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e5\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e7\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00e8\u0001\u0010\u00cc\u0001R\u001f\u0010\u00ea\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e9\u00010\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ea\u0001\u0010\u00c7\u0001R$\u0010\u00eb\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e9\u00010\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00eb\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00ec\u0001\u0010\u00cc\u0001R\u001e\u0010\u00ed\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ed\u0001\u0010\u00c7\u0001R#\u0010\u00ee\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u00c8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ee\u0001\u0010\u00ca\u0001\u001a\u0006\u0008\u00ef\u0001\u0010\u00cc\u0001R\u0019\u0010\u00f0\u0001\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f0\u0001\u0010\u00f1\u0001R\u0014\u0010\u00f2\u0001\u001a\u00020\u000c8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00f2\u0001\u0010\u00f3\u0001R\u0018\u0010|\u001a\u0004\u0018\u00010{8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001R\u001d\u0010\u00fa\u0001\u001a\t\u0012\u0005\u0012\u00030\u00f8\u00010Y8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00f9\u0001\u0010x\u00a8\u0006\u00fb\u0001"
    }
    d2 = {
        "Lcom/zykj/view/board/board/BoardViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "",
        "right",
        "bottom",
        "Ld6/s;",
        "initZoomPointF",
        "(FF)V",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "boardControl",
        "",
        "haveCache",
        "",
        "duration",
        "initBoardControl",
        "(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V",
        "Lcom/zykj/view/board/board/BoardViewConfig;",
        "boardViewConfig",
        "updateUIByViewConfig",
        "(Lcom/zykj/view/board/board/BoardViewConfig;)V",
        "Lcom/zykj/view/board/board/BoardSketchConfig;",
        "boardSketchConfig",
        "initSketchConfig",
        "(Lcom/zykj/view/board/board/BoardSketchConfig;)V",
        "Lcom/zykj/view/board/board/BoardCallbackConfig;",
        "boardCallbackConfig",
        "initCallbackConfig",
        "(Lcom/zykj/view/board/board/BoardCallbackConfig;)V",
        "Lcom/zykj/view/board/board/MainToolType;",
        "mainToolType",
        "updateModeType",
        "(Lcom/zykj/view/board/board/MainToolType;)V",
        "isRecover",
        "startRevoke",
        "(Z)V",
        "isTouchable",
        "updateTouchable",
        "isZoomUp",
        "updateZoomLevel",
        "Lcom/zykj/view/board/board/MinorToolType;",
        "minorToolType",
        "updateMinorToolType",
        "(Lcom/zykj/view/board/board/MinorToolType;)V",
        "switchSelectTool",
        "switchPenTool",
        "switchEraserTool",
        "switchGraphTool",
        "switchBackgroundTool",
        "cleanPage",
        "handleExpandClick",
        "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
        "selectGraphEnum",
        "updateSelectTypeByEnum",
        "(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V",
        "Lcom/zykj/view/board/board/PenType;",
        "penType",
        "updatePenType",
        "(Lcom/zykj/view/board/board/PenType;)V",
        "",
        "level",
        "updatePenSizeLevel",
        "(I)V",
        "updatePenColorLevel",
        "color",
        "updatePenCustomColor",
        "dismissCustomColorPalette",
        "dismissPanelsForCanvasTouch",
        "dismissPanelsForToolbarClick",
        "dismissAllPanelsAndSelection",
        "dismissPanelsForSelectToolbarItemClick",
        "updateEraserSizeLevel",
        "Lcom/zykj/view/board/board/GraphType;",
        "graphType",
        "updateGraphType",
        "(Lcom/zykj/view/board/board/GraphType;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "path",
        "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
        "scaleTypeEnum",
        "isSelected",
        "filename",
        "Lkotlin/Function1;",
        "imagePathCallback",
        "addImageGraph",
        "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;)V",
        "",
        "pathList",
        "addBitmapList",
        "(Ljava/util/List;Z)V",
        "content",
        "addText",
        "(Ljava/lang/String;)V",
        "updateBackgroundLevel",
        "areaMoveStart",
        "horizontalProgress",
        "verticalProgress",
        "areaMoving",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "areaMoveEnd",
        "switchRecordState",
        "isMicroPhoneOn",
        "updateMicroPhone",
        "dropDraftCache",
        "isOpen",
        "updateExpandState",
        "needClear",
        "isContentThumbnail",
        "Lkotlin/Function2;",
        "",
        "Lh6/c;",
        "",
        "error",
        "callback",
        "getSavePath",
        "(ZZLr6/e;Lr6/e;)V",
        "getRecordingImagePathList",
        "()Ljava/util/List;",
        "getPathListByImageGraph",
        "resetRevoke",
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "pageControl",
        "initPageControl",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;)V",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "initEraserSizeLevel",
        "(Lcom/zykj/blackboard/bean/BoardConfig;)V",
        "initSelectConfig",
        "initPenConfig",
        "initTextConfig",
        "initBackgroundLevel",
        "initMoveConfig",
        "initGraphDeleteListener",
        "initRecordListener",
        "initMicroPhoneListener",
        "initTextChangeListener",
        "initGeometryColorListener",
        "initAreaMoveListener",
        "initEventListener",
        "initRevokeListener",
        "reloadBackgroundToUI",
        "reloadZoomAndMoveToUI",
        "updateConfigAboutSelect",
        "switchPenCustomColor",
        "updateConfigAboutPen",
        "updateConfigAboutEraser",
        "applyGeometryStyleFromPenState",
        "syncGeometryStyleIfInGeometryMode",
        "config",
        "setGeometryColorCompat",
        "(Lcom/zykj/blackboard/bean/BoardConfig;I)V",
        "Lcom/zykj/view/board/board/BoardSketchConfig;",
        "value",
        "Lcom/zykj/view/board/board/BoardCallbackConfig;",
        "getBoardCallbackConfig",
        "()Lcom/zykj/view/board/board/BoardCallbackConfig;",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "Lcom/zykj/blackboard/proxy/TextEditView;",
        "textEditView",
        "Lcom/zykj/blackboard/proxy/TextEditView;",
        "getTextEditView",
        "()Lcom/zykj/blackboard/proxy/TextEditView;",
        "setTextEditView",
        "(Lcom/zykj/blackboard/proxy/TextEditView;)V",
        "Lcom/zykj/blackboard/proxy/ImageCropView;",
        "imageCropView",
        "Lcom/zykj/blackboard/proxy/ImageCropView;",
        "getImageCropView",
        "()Lcom/zykj/blackboard/proxy/ImageCropView;",
        "setImageCropView",
        "(Lcom/zykj/blackboard/proxy/ImageCropView;)V",
        "Lcom/zykj/blackboard/proxy/CustomColorView;",
        "customColorView",
        "Lcom/zykj/blackboard/proxy/CustomColorView;",
        "getCustomColorView",
        "()Lcom/zykj/blackboard/proxy/CustomColorView;",
        "setCustomColorView",
        "(Lcom/zykj/blackboard/proxy/CustomColorView;)V",
        "zoomLevelIndex",
        "I",
        "Landroid/graphics/PointF;",
        "zoomPointF",
        "Landroid/graphics/PointF;",
        "Lkotlinx/coroutines/flow/x;",
        "Lcom/zykj/view/board/board/BoardEvent;",
        "_event",
        "Lkotlinx/coroutines/flow/x;",
        "Lkotlinx/coroutines/flow/c0;",
        "event",
        "Lkotlinx/coroutines/flow/c0;",
        "getEvent",
        "()Lkotlinx/coroutines/flow/c0;",
        "Lkotlinx/coroutines/flow/y;",
        "Lcom/zykj/view/board/board/MainToolState;",
        "_mainToolState",
        "Lkotlinx/coroutines/flow/y;",
        "Lkotlinx/coroutines/flow/m0;",
        "mainToolState",
        "Lkotlinx/coroutines/flow/m0;",
        "getMainToolState",
        "()Lkotlinx/coroutines/flow/m0;",
        "Lcom/zykj/view/board/board/SelectToolState;",
        "_selectToolState",
        "selectToolState",
        "getSelectToolState",
        "Lcom/zykj/view/board/board/PenToolState;",
        "_penToolState",
        "penToolState",
        "getPenToolState",
        "Lcom/zykj/view/board/board/EraserToolState;",
        "_eraserToolState",
        "eraserToolState",
        "getEraserToolState",
        "Lcom/zykj/view/board/board/GraphToolState;",
        "_graphToolState",
        "graphToolState",
        "getGraphToolState",
        "Lcom/zykj/view/board/board/BackgroundToolState;",
        "_backgroundToolState",
        "backgroundToolState",
        "getBackgroundToolState",
        "Lcom/zykj/view/board/board/ExtraUIState;",
        "_extraUIState",
        "extraUIState",
        "getExtraUIState",
        "Lcom/zykj/view/board/board/RecordState;",
        "_recordState",
        "recordState",
        "getRecordState",
        "Lcom/zykj/view/board/board/ExpandState;",
        "_expandState",
        "expandState",
        "getExpandState",
        "_loadFinished",
        "loadFinished",
        "getLoadFinished",
        "lastIsMicroPhoneOn",
        "Z",
        "isImageOutOfCount",
        "()Z",
        "getPageControl",
        "()Lcom/zykj/blackboard/core/edit/IPageControl;",
        "getBoardConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/view/board/board/ZoomLevel;",
        "getCurrentZoomLevelList",
        "currentZoomLevelList",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n226#2,5:1505\n226#2,5:1510\n226#2,5:1515\n226#2,5:1520\n226#2,5:1525\n226#2,5:1537\n226#2,3:1542\n229#2,2:1547\n226#2,5:1549\n226#2,5:1561\n226#2,3:1566\n229#2,2:1571\n226#2,5:1580\n226#2,5:1585\n226#2,5:1590\n226#2,5:1595\n226#2,5:1600\n226#2,5:1605\n226#2,5:1610\n226#2,5:1615\n226#2,5:1620\n226#2,5:1625\n226#2,5:1630\n226#2,5:1635\n226#2,5:1640\n226#2,5:1645\n226#2,5:1650\n226#2,5:1655\n226#2,5:1660\n226#2,5:1665\n226#2,5:1670\n226#2,5:1675\n226#2,5:1681\n226#2,5:1686\n226#2,5:1691\n226#2,5:1696\n226#2,5:1705\n226#2,5:1710\n226#2,5:1715\n226#2,5:1720\n226#2,5:1725\n226#2,5:1730\n226#2,5:1735\n226#2,5:1740\n226#2,5:1745\n226#2,5:1750\n226#2,5:1755\n226#2,5:1760\n226#2,5:1765\n226#2,5:1770\n360#3,7:1530\n1869#3,2:1545\n360#3,7:1554\n230#3,2:1569\n360#3,7:1573\n1869#3:1701\n1870#3:1704\n1#4:1680\n1310#5,2:1702\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n*L\n170#1:1495,5\n173#1:1500,5\n286#1:1505,5\n293#1:1510,5\n300#1:1515,5\n309#1:1520,5\n315#1:1525,5\n349#1:1537,5\n358#1:1542,3\n358#1:1547,2\n389#1:1549,5\n436#1:1561,5\n608#1:1566,3\n608#1:1571,2\n635#1:1580,5\n653#1:1585,5\n656#1:1590,5\n694#1:1595,5\n755#1:1600,5\n767#1:1605,5\n775#1:1610,5\n789#1:1615,5\n799#1:1620,5\n810#1:1625,5\n824#1:1630,5\n838#1:1635,5\n895#1:1640,5\n971#1:1645,5\n980#1:1650,5\n995#1:1655,5\n1011#1:1660,5\n1018#1:1665,5\n1032#1:1670,5\n1043#1:1675,5\n1057#1:1681,5\n1069#1:1686,5\n1107#1:1691,5\n1132#1:1696,5\n1295#1:1705,5\n1308#1:1710,5\n1378#1:1715,5\n1397#1:1720,5\n1399#1:1725,5\n495#1:1730,5\n498#1:1735,5\n501#1:1740,5\n512#1:1745,5\n549#1:1750,5\n557#1:1755,5\n565#1:1760,5\n581#1:1765,5\n591#1:1770,5\n344#1:1530,7\n365#1:1545,2\n431#1:1554,7\n610#1:1569,2\n625#1:1573,7\n1183#1:1701\n1183#1:1704\n1185#1:1702,2\n*E\n"
    }
.end annotation


# instance fields
.field private final _backgroundToolState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _eraserToolState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _event:Lkotlinx/coroutines/flow/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/x;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _expandState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _extraUIState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _graphToolState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _loadFinished:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _mainToolState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _penToolState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _recordState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _selectToolState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final backgroundToolState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private boardCallbackConfig:Lcom/zykj/view/board/board/BoardCallbackConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private customColorView:Lcom/zykj/blackboard/proxy/CustomColorView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final eraserToolState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final event:Lkotlinx/coroutines/flow/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/c0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final expandState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final extraUIState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphToolState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private imageCropView:Lcom/zykj/blackboard/proxy/ImageCropView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastIsMicroPhoneOn:Z

.field private final loadFinished:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mainToolState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final penToolState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recordState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final selectToolState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private textEditView:Lcom/zykj/blackboard/proxy/TextEditView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private zoomLevelIndex:I

.field private final zoomPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getZoomLevelList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/zykj/view/board/board/ZoomLevel$Level3;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level3;

    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iput v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomPointF:Landroid/graphics/PointF;

    .line 24
    .line 25
    const/4 v1, 0x7

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v2, v1, v3}, Lkotlinx/coroutines/flow/h;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/f0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_event:Lkotlinx/coroutines/flow/x;

    .line 33
    .line 34
    new-instance v4, Lkotlinx/coroutines/flow/z;

    .line 35
    .line 36
    invoke-direct {v4, v1}, Lkotlinx/coroutines/flow/z;-><init>(Lkotlinx/coroutines/flow/x;)V

    .line 37
    .line 38
    .line 39
    iput-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->event:Lkotlinx/coroutines/flow/c0;

    .line 40
    .line 41
    new-instance v5, Lcom/zykj/view/board/board/MainToolState;

    .line 42
    .line 43
    const/16 v12, 0x3f

    .line 44
    .line 45
    const/4 v13, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    invoke-direct/range {v5 .. v13}, Lcom/zykj/view/board/board/MainToolState;-><init>(ZZZZZLcom/zykj/view/board/board/MainToolType;ILkotlin/jvm/internal/e;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 60
    .line 61
    new-instance v4, Lkotlinx/coroutines/flow/a0;

    .line 62
    .line 63
    invoke-direct {v4, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 64
    .line 65
    .line 66
    iput-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->mainToolState:Lkotlinx/coroutines/flow/m0;

    .line 67
    .line 68
    new-instance v5, Lcom/zykj/view/board/board/SelectToolState;

    .line 69
    .line 70
    const/16 v11, 0x1f

    .line 71
    .line 72
    const/4 v12, 0x0

    .line 73
    invoke-direct/range {v5 .. v12}, Lcom/zykj/view/board/board/SelectToolState;-><init>(ZZZZZILkotlin/jvm/internal/e;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_selectToolState:Lkotlinx/coroutines/flow/y;

    .line 81
    .line 82
    new-instance v4, Lkotlinx/coroutines/flow/a0;

    .line 83
    .line 84
    invoke-direct {v4, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 85
    .line 86
    .line 87
    iput-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->selectToolState:Lkotlinx/coroutines/flow/m0;

    .line 88
    .line 89
    new-instance v5, Lcom/zykj/view/board/board/PenToolState;

    .line 90
    .line 91
    const/16 v13, 0x7f

    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    invoke-direct/range {v5 .. v14}, Lcom/zykj/view/board/board/PenToolState;-><init>(ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILkotlin/jvm/internal/e;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v5}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 106
    .line 107
    new-instance v4, Lkotlinx/coroutines/flow/a0;

    .line 108
    .line 109
    invoke-direct {v4, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 110
    .line 111
    .line 112
    iput-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->penToolState:Lkotlinx/coroutines/flow/m0;

    .line 113
    .line 114
    new-instance v1, Lcom/zykj/view/board/board/EraserToolState;

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    invoke-direct {v1, v3, v4, v3}, Lcom/zykj/view/board/board/EraserToolState;-><init>(Lcom/zykj/view/board/board/EraserType;ILkotlin/jvm/internal/e;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_eraserToolState:Lkotlinx/coroutines/flow/y;

    .line 125
    .line 126
    new-instance v5, Lkotlinx/coroutines/flow/a0;

    .line 127
    .line 128
    invoke-direct {v5, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 129
    .line 130
    .line 131
    iput-object v5, v0, Lcom/zykj/view/board/board/BoardViewModel;->eraserToolState:Lkotlinx/coroutines/flow/m0;

    .line 132
    .line 133
    new-instance v6, Lcom/zykj/view/board/board/GraphToolState;

    .line 134
    .line 135
    const/16 v12, 0x1f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v11, 0x0

    .line 141
    invoke-direct/range {v6 .. v13}, Lcom/zykj/view/board/board/GraphToolState;-><init>(ZZZZLcom/zykj/view/board/board/GraphType;ILkotlin/jvm/internal/e;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v6}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_graphToolState:Lkotlinx/coroutines/flow/y;

    .line 149
    .line 150
    new-instance v5, Lkotlinx/coroutines/flow/a0;

    .line 151
    .line 152
    invoke-direct {v5, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 153
    .line 154
    .line 155
    iput-object v5, v0, Lcom/zykj/view/board/board/BoardViewModel;->graphToolState:Lkotlinx/coroutines/flow/m0;

    .line 156
    .line 157
    new-instance v1, Lcom/zykj/view/board/board/BackgroundToolState;

    .line 158
    .line 159
    const/4 v5, 0x3

    .line 160
    invoke-direct {v1, v2, v3, v5, v3}, Lcom/zykj/view/board/board/BackgroundToolState;-><init>(ZLcom/zykj/view/board/board/BackgroundType;ILkotlin/jvm/internal/e;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_backgroundToolState:Lkotlinx/coroutines/flow/y;

    .line 168
    .line 169
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 170
    .line 171
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 172
    .line 173
    .line 174
    iput-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->backgroundToolState:Lkotlinx/coroutines/flow/m0;

    .line 175
    .line 176
    new-instance v5, Lcom/zykj/view/board/board/ExtraUIState;

    .line 177
    .line 178
    const/16 v15, 0x1ff

    .line 179
    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    const/4 v7, 0x0

    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v11, 0x0

    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    invoke-direct/range {v5 .. v16}, Lcom/zykj/view/board/board/ExtraUIState;-><init>(Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILkotlin/jvm/internal/e;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v5}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 197
    .line 198
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 199
    .line 200
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 201
    .line 202
    .line 203
    iput-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->extraUIState:Lkotlinx/coroutines/flow/m0;

    .line 204
    .line 205
    new-instance v5, Lcom/zykj/view/board/board/RecordState;

    .line 206
    .line 207
    const/4 v9, 0x7

    .line 208
    const/4 v10, 0x0

    .line 209
    const/4 v7, 0x0

    .line 210
    const/4 v8, 0x0

    .line 211
    invoke-direct/range {v5 .. v10}, Lcom/zykj/view/board/board/RecordState;-><init>(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILkotlin/jvm/internal/e;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v5}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 219
    .line 220
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 221
    .line 222
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 223
    .line 224
    .line 225
    iput-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->recordState:Lkotlinx/coroutines/flow/m0;

    .line 226
    .line 227
    new-instance v1, Lcom/zykj/view/board/board/ExpandState;

    .line 228
    .line 229
    invoke-direct {v1, v3, v4, v3}, Lcom/zykj/view/board/board/ExpandState;-><init>(Lcom/zykj/view/board/board/ExpandStatus;ILkotlin/jvm/internal/e;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_expandState:Lkotlinx/coroutines/flow/y;

    .line 237
    .line 238
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 239
    .line 240
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 241
    .line 242
    .line 243
    iput-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->expandState:Lkotlinx/coroutines/flow/m0;

    .line 244
    .line 245
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 246
    .line 247
    invoke-static {v1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_loadFinished:Lkotlinx/coroutines/flow/y;

    .line 252
    .line 253
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 254
    .line 255
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 256
    .line 257
    .line 258
    iput-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->loadFinished:Lkotlinx/coroutines/flow/m0;

    .line 259
    .line 260
    iput-boolean v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->lastIsMicroPhoneOn:Z

    .line 261
    .line 262
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/board/BoardViewModel;F)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initTextChangeListener$lambda$40(Lcom/zykj/view/board/board/BoardViewModel;F)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBoardControl$p(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IBoardControl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageControl(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$get_event$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_event:Lkotlinx/coroutines/flow/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_expandState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_expandState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_extraUIState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_mainToolState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_penToolState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$syncGeometryStyleIfInGeometryMode(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->syncGeometryStyleIfInGeometryMode()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$updateConfigAboutPen(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutPen()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic addBitmapList$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->addBitmapList(Ljava/util/List;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic addImageGraph$default(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    sget-object p3, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->MODE_ADAPTER_8:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 19
    .line 20
    if-eqz p8, :cond_3

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 24
    .line 25
    if-eqz p8, :cond_4

    .line 26
    .line 27
    const-string p5, ""

    .line 28
    .line 29
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 30
    .line 31
    if-eqz p7, :cond_5

    .line 32
    .line 33
    move-object p6, v0

    .line 34
    :cond_5
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/view/board/board/BoardViewModel;->addImageGraph(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final applyGeometryStyleFromPenState()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/view/board/board/PenToolState;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenType()Lcom/zykj/view/board/board/PenType;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenType;->getPaintWidthList()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenSizeLevel()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintWidth(F)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintWidth(F)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpGeometryColor()Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenType()Lcom/zykj/view/board/board/PenType;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenType;->getPaintColorAlpha()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v2, v0}, Lcom/zykj/view/utils/ExtKt;->withAlpha(IF)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-direct {p0, v1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->setGeometryColorCompat(Lcom/zykj/blackboard/bean/BoardConfig;I)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public static synthetic areaMoveEnd$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic areaMoving$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initTextChangeListener$lambda$39(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/view/board/board/BoardViewModel;Z)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initMicroPhoneListener$lambda$38(Lcom/zykj/view/board/board/BoardViewModel;Z)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initGeometryColorListener$lambda$41(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final dropDraftCache$lambda$104(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/zykj/view/board/board/BoardViewModel;->initPageControl(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    new-array p0, p0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "\u753b\u677f\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u9000\u51fa\u540e\u91cd\u8bd5"

    .line 15
    .line 16
    invoke-static {v0, p0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initEventListener$lambda$49(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->initAreaMoveListener$lambda$43(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->initRevokeListener$lambda$51(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

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

.method private final getCurrentZoomLevelList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/ZoomLevel;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardSketchConfig;->getZoomFiveLevel()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getZoomLevelList5()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getZoomLevelList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method private final getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getPages()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public static synthetic getSavePath$default(Lcom/zykj/view/board/board/BoardViewModel;ZZLr6/e;Lr6/e;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardSketchConfig;->getNeedCommitWithDeleteCache()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x1

    .line 15
    :cond_1
    :goto_0
    and-int/lit8 p6, p5, 0x2

    .line 16
    .line 17
    if-eqz p6, :cond_3

    .line 18
    .line 19
    iget-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardSketchConfig;->isThumbnailContent()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p2, 0x0

    .line 29
    :cond_3
    :goto_1
    and-int/lit8 p6, p5, 0x4

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    if-eqz p6, :cond_4

    .line 33
    .line 34
    new-instance p3, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$1;

    .line 35
    .line 36
    invoke-direct {p3, v0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$1;-><init>(Lh6/c;)V

    .line 37
    .line 38
    .line 39
    :cond_4
    and-int/lit8 p5, p5, 0x8

    .line 40
    .line 41
    if-eqz p5, :cond_5

    .line 42
    .line 43
    new-instance p4, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$2;

    .line 44
    .line 45
    invoke-direct {p4, v0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$2;-><init>(Lh6/c;)V

    .line 46
    .line 47
    .line 48
    :cond_5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardViewModel;->getSavePath(ZZLr6/e;Lr6/e;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static synthetic h(Lcom/zykj/view/board/board/BoardViewModel;J)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->initRecordListener$lambda$34(Lcom/zykj/view/board/board/BoardViewModel;J)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->initAreaMoveListener$lambda$47(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final initAreaMoveListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/l;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/zykj/view/board/board/m;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/m;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/zykj/view/board/board/l;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/l;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2}, Lcom/zykj/view/board/board/PageControlExtKt;->setAreaMoveListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/e;Lr6/a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private static final initAreaMoveListener$lambda$43(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 14

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    const/16 v12, 0x1b7

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 36
    .line 37
    return-object p0
.end method

.method private static final initAreaMoveListener$lambda$45(Lcom/zykj/view/board/board/BoardViewModel;FF)Ld6/s;
    .locals 14

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    const/16 v12, 0x16f

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v11, 0x0

    .line 23
    move v7, p1

    .line 24
    move/from16 v10, p2

    .line 25
    .line 26
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 37
    .line 38
    return-object p0
.end method

.method private static final initAreaMoveListener$lambda$47(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 14

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    const/16 v12, 0x1b7

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x1

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 36
    .line 37
    return-object p0
.end method

.method private final initBackgroundLevel(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpBackgroundColor()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getBackgroundTypeList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move v3, v1

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, -0x1

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lcom/zykj/view/board/board/BackgroundType;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ne v4, v0, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v3, v5

    .line 45
    :goto_1
    if-ne v3, v5, :cond_3

    .line 46
    .line 47
    :cond_2
    move v3, v1

    .line 48
    :cond_3
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getBackgroundTypeList()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/zykj/view/board/board/BackgroundType;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->_backgroundToolState:Lkotlinx/coroutines/flow/y;

    .line 59
    .line 60
    :cond_4
    move-object v3, v2

    .line 61
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 62
    .line 63
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    move-object v5, v4

    .line 68
    check-cast v5, Lcom/zykj/view/board/board/BackgroundToolState;

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x1

    .line 72
    invoke-static {v5, v1, v0, v7, v6}, Lcom/zykj/view/board/board/BackgroundToolState;->copy$default(Lcom/zykj/view/board/board/BackgroundToolState;ZLcom/zykj/view/board/board/BackgroundType;ILjava/lang/Object;)Lcom/zykj/view/board/board/BackgroundToolState;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBackgroundColor(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BackgroundType;->getLineColor()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineColor(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BackgroundType;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BackgroundType;->getLineSpace()F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineSpace(F)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static synthetic initBoardControl$default(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    const-wide/16 p3, 0x0

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardViewModel;->initBoardControl(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final initBoardControl$lambda$5(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initPageControl(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_loadFinished:Lkotlinx/coroutines/flow/y;

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/flow/n0;->j(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardCallbackConfig:Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnInitFinished()Lr6/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 32
    .line 33
    return-object p0
.end method

.method private static final initBoardControl$lambda$9$lambda$8(Lcom/zykj/view/board/board/BoardViewModel;Lr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    new-array p0, p0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string p1, "\u753b\u677f\u52a0\u8f7d\u5931\u8d25\uff0c\u8bf7\u9000\u51fa\u540e\u91cd\u8bd5"

    .line 15
    .line 16
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    return-object p0
.end method

.method private final initEraserSizeLevel(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpEraserSize()Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getEraserTypeList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move v2, v0

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, -0x1

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/zykj/view/board/board/EraserType;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/zykj/view/board/board/EraserType;->getSize()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    cmpg-float v3, v3, p1

    .line 39
    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v2, v4

    .line 47
    :goto_1
    if-ne v2, v4, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v0, v2

    .line 51
    :cond_3
    :goto_2
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getEraserTypeList()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/zykj/view/board/board/EraserType;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_eraserToolState:Lkotlinx/coroutines/flow/y;

    .line 62
    .line 63
    :cond_4
    move-object v1, v0

    .line 64
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 65
    .line 66
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v3, v2

    .line 71
    check-cast v3, Lcom/zykj/view/board/board/EraserToolState;

    .line 72
    .line 73
    invoke-virtual {v3, p1}, Lcom/zykj/view/board/board/EraserToolState;->copy(Lcom/zykj/view/board/board/EraserType;)Lcom/zykj/view/board/board/EraserToolState;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    return-void
.end method

.method private final initEventListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/zykj/view/board/board/PageControlExtKt;->addTempEventListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final initEventListener$lambda$49(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Ld6/s;
    .locals 13

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 7
    .line 8
    :cond_0
    move-object p1, p0

    .line 9
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 10
    .line 11
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Lcom/zykj/view/board/board/ExtraUIState;

    .line 17
    .line 18
    const/16 v11, 0x1fb

    .line 19
    .line 20
    const/4 v12, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1, v0, v1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 41
    .line 42
    return-object p0
.end method

.method private final initGeometryColorListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/k;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/zykj/view/board/board/PageControlExtKt;->bindGeometryColorSelectListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final initGeometryColorListener$lambda$41(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/zykj/view/utils/SPDataKt;->setSpGeometryColor(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setGeometryStrokeColor(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->syncGeometryStyleIfInGeometryMode()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 21
    .line 22
    return-object p0
.end method

.method private final initGraphDeleteListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$initGraphDeleteListener$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/board/BoardViewModel$initGraphDeleteListener$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final initMicroPhoneListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/k;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/zykj/view/board/board/PageControlExtKt;->setMicroPhoneListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final initMicroPhoneListener$lambda$38(Lcom/zykj/view/board/board/BoardViewModel;Z)Ld6/s;
    .locals 8

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :goto_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/RecordState;

    .line 12
    .line 13
    const/4 v6, 0x5

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    move v4, p1

    .line 18
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, v1, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    move p1, v4

    .line 32
    goto :goto_0
.end method

.method private final initMoveConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardSketchConfig;->getNeedTranslate()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setHorizontalTranslate(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxWidthTimes(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardSketchConfig;->getDefaultMoveRange()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private final initPageControl(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    const-string v0, "initPageControl Start"

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
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initGraphDeleteListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initRecordListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initMicroPhoneListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initTextChangeListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initGeometryColorListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initAreaMoveListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initEventListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initRevokeListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->reloadBackgroundToUI()V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->reloadZoomAndMoveToUI()V

    .line 38
    .line 39
    .line 40
    const-string p1, "initPageControl Finished"

    .line 41
    .line 42
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private final initPenConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 12

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p1

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/PenToolState;

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpPenColor()Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_2

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Lcom/zykj/view/utils/ExtKt;->toPenColor(I)Lcom/zykj/view/board/board/PenColor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move-object v7, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    :goto_1
    sget-object v3, Lcom/zykj/view/board/board/PenColor$ColorBlack;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorBlack;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_2
    instance-of v3, v7, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    invoke-virtual {v7}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    :goto_3
    move v8, v3

    .line 45
    goto :goto_4

    .line 46
    :cond_3
    new-instance v3, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct {v3, v4, v5, v6}, Lcom/zykj/view/board/board/PenColor$ColorCustom;-><init>(IILkotlin/jvm/internal/e;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    goto :goto_3

    .line 58
    :goto_4
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getPenTypeList()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpPenTypeLevel()Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_5

    .line 73
    :cond_4
    move v5, v4

    .line 74
    :goto_5
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    move-object v5, v3

    .line 79
    check-cast v5, Lcom/zykj/view/board/board/PenType;

    .line 80
    .line 81
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpPenSizeLevel()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    :cond_5
    move v6, v4

    .line 92
    const/16 v10, 0x43

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v3, 0x0

    .line 96
    const/4 v4, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    invoke-static/range {v2 .. v11}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    return-void
.end method

.method private final initRecordListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/l;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/l;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/zykj/view/board/board/k;

    .line 8
    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/zykj/view/board/board/l;

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/l;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2}, Lcom/zykj/view/board/board/PageControlExtKt;->setRecordListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/c;Lr6/a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private static final initRecordListener$lambda$32(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 8

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/RecordState;

    .line 12
    .line 13
    sget-object v3, Lcom/zykj/view/board/board/RecordStatus$Recording;->INSTANCE:Lcom/zykj/view/board/board/RecordStatus$Recording;

    .line 14
    .line 15
    const/4 v6, 0x6

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 30
    .line 31
    return-object p0
.end method

.method private static final initRecordListener$lambda$34(Lcom/zykj/view/board/board/BoardViewModel;J)Ld6/s;
    .locals 8

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/RecordState;

    .line 12
    .line 13
    sget-object v3, Lcom/zykj/view/utils/TimeFormatUtils;->INSTANCE:Lcom/zykj/view/utils/TimeFormatUtils;

    .line 14
    .line 15
    invoke-virtual {v3, p1, p2}, Lcom/zykj/view/utils/TimeFormatUtils;->formatTimeWithHour(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v6, 0x3

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 34
    .line 35
    return-object p0
.end method

.method private static final initRecordListener$lambda$36(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 8

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v0, p0

    .line 4
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/RecordState;

    .line 12
    .line 13
    sget-object v3, Lcom/zykj/view/board/board/RecordStatus$Continue;->INSTANCE:Lcom/zykj/view/board/board/RecordStatus$Continue;

    .line 14
    .line 15
    const/4 v6, 0x6

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 30
    .line 31
    return-object p0
.end method

.method private final initRevokeListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/m;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/m;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/zykj/view/board/board/PageControlExtKt;->addRevokeListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final initRevokeListener$lambda$51(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Ld6/s;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :goto_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/MainToolState;

    .line 12
    .line 13
    const/16 v10, 0x33

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    move v6, p1

    .line 21
    move v7, p2

    .line 22
    invoke-static/range {v3 .. v11}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->reloadBackgroundToUI()V

    .line 33
    .line 34
    .line 35
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    move p1, v6

    .line 39
    move p2, v7

    .line 40
    goto :goto_0
.end method

.method private final initSelectConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 13

    .line 1
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpSelectGraphEnum()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/zykj/blackboard/enums/SelectGraphEnumKt;->getAllSelectGraphEnumList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectIncludeGraphEnumListByDrag(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_selectToolState:Lkotlinx/coroutines/flow/y;

    .line 15
    .line 16
    :cond_1
    move-object v1, p1

    .line 17
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 18
    .line 19
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    check-cast v3, Lcom/zykj/view/board/board/SelectToolState;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    const/4 v4, 0x0

    .line 31
    move v5, v4

    .line 32
    move v6, v5

    .line 33
    move v7, v6

    .line 34
    move v8, v7

    .line 35
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    if-eqz v10, :cond_7

    .line 40
    .line 41
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    check-cast v10, Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 46
    .line 47
    sget-object v11, Lcom/zykj/view/board/board/BoardViewModel$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 48
    .line 49
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    aget v10, v11, v10

    .line 54
    .line 55
    const/4 v11, 0x1

    .line 56
    if-eq v10, v11, :cond_6

    .line 57
    .line 58
    const/4 v12, 0x2

    .line 59
    if-eq v10, v12, :cond_5

    .line 60
    .line 61
    const/4 v12, 0x3

    .line 62
    if-eq v10, v12, :cond_4

    .line 63
    .line 64
    const/4 v12, 0x4

    .line 65
    if-eq v10, v12, :cond_3

    .line 66
    .line 67
    const/4 v8, 0x5

    .line 68
    if-ne v10, v8, :cond_2

    .line 69
    .line 70
    move v8, v11

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 73
    .line 74
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_3
    move v7, v11

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    move v6, v11

    .line 81
    goto :goto_0

    .line 82
    :cond_5
    move v5, v11

    .line 83
    goto :goto_0

    .line 84
    :cond_6
    move v4, v11

    .line 85
    goto :goto_0

    .line 86
    :cond_7
    invoke-virtual/range {v3 .. v8}, Lcom/zykj/view/board/board/SelectToolState;->copy(ZZZZZ)Lcom/zykj/view/board/board/SelectToolState;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    return-void
.end method

.method private final initTextChangeListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/k;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/zykj/view/board/board/k;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lcom/zykj/view/board/board/PageControlExtKt;->setTextSelectListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;Lr6/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final initTextChangeListener$lambda$39(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/zykj/view/utils/SPDataKt;->setSpTextColor(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final initTextChangeListener$lambda$40(Lcom/zykj/view/board/board/BoardViewModel;F)Ld6/s;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/zykj/view/utils/SPDataKt;->setSpTextSize(Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 18
    .line 19
    return-object p0
.end method

.method private final initTextConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalText(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpTextColor()Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 18
    .line 19
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/zykj/view/board/board/PenToolState;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    :goto_0
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpTextSize()Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/high16 v1, 0x44160000    # 600.0f

    .line 56
    .line 57
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->textEditView:Lcom/zykj/blackboard/proxy/TextEditView;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setTextEditView(Lcom/zykj/blackboard/proxy/TextEditView;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static synthetic j(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->initRecordListener$lambda$36(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/k;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initBoardControl$lambda$9$lambda$8(Lcom/zykj/view/board/board/BoardViewModel;Lr6/c;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/view/board/board/BoardViewModel;FF)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->initAreaMoveListener$lambda$45(Lcom/zykj/view/board/board/BoardViewModel;FF)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dropDraftCache$lambda$104(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initBoardControl$lambda$5(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->initRecordListener$lambda$32(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final reloadBackgroundToUI()V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getBackgroundColor()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_backgroundToolState:Lkotlinx/coroutines/flow/y;

    .line 13
    .line 14
    :cond_1
    move-object v2, v1

    .line 15
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 16
    .line 17
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lcom/zykj/view/board/board/BackgroundToolState;

    .line 23
    .line 24
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getBackgroundTypeList()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Lcom/zykj/view/board/board/BackgroundType;

    .line 43
    .line 44
    invoke-virtual {v6}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-ne v7, v0, :cond_2

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    invoke-static {v4, v8, v6, v5, v7}, Lcom/zykj/view/board/board/BackgroundToolState;->copy$default(Lcom/zykj/view/board/board/BackgroundToolState;ZLcom/zykj/view/board/board/BackgroundType;ILjava/lang/Object;)Lcom/zykj/view/board/board/BackgroundToolState;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    :goto_0
    return-void

    .line 64
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 65
    .line 66
    const-string v1, "Collection contains no element matching the predicate."

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method private final reloadZoomAndMoveToUI()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_1
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getZoomLevel()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getCurrentZoomLevelList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/4 v7, -0x1

    .line 37
    if-eqz v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Lcom/zykj/view/board/board/ZoomLevel;

    .line 44
    .line 45
    invoke-virtual {v6}, Lcom/zykj/view/board/board/ZoomLevel;->getZoomValue()F

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    cmpg-float v6, v6, v3

    .line 50
    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move v5, v7

    .line 58
    :goto_1
    if-ne v5, v7, :cond_4

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getCurrentZoomLevelList()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v5, Lcom/zykj/view/board/board/ZoomLevel$Level3;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level3;

    .line 65
    .line 66
    invoke-interface {v4, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    :cond_4
    iput v5, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    int-to-float v4, v4

    .line 74
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    int-to-float v5, v5

    .line 83
    mul-float/2addr v5, v3

    .line 84
    div-float v12, v4, v5

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    int-to-float v2, v2

    .line 95
    mul-float/2addr v2, v3

    .line 96
    div-float v15, v4, v2

    .line 97
    .line 98
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 99
    .line 100
    :cond_5
    move-object v3, v2

    .line 101
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 102
    .line 103
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    move-object v6, v4

    .line 108
    check-cast v6, Lcom/zykj/view/board/board/ExtraUIState;

    .line 109
    .line 110
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveVerticalProgress()F

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveHorizontalProgress()F

    .line 115
    .line 116
    .line 117
    move-result v14

    .line 118
    const/16 v16, 0x4f

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v13, 0x0

    .line 127
    invoke-static/range {v6 .. v17}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_5

    .line 136
    .line 137
    :goto_2
    return-void
.end method

.method private final setGeometryColorCompat(Lcom/zykj/blackboard/bean/BoardConfig;I)V
    .locals 10

    .line 1
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    const/high16 v0, -0x1000000

    .line 4
    .line 5
    or-int v2, p2, v0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintColor(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :goto_0
    :try_start_1
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintColor(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_1
    move-exception v0

    .line 30
    move-object p2, v0

    .line 31
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_1
    :try_start_2
    invoke-virtual {p1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setGeometryStrokeColor(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_2
    move-exception v0

    .line 46
    move-object p2, v0

    .line 47
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :goto_2
    const-string v7, "setShapeColor"

    .line 55
    .line 56
    const-string v8, "setStrokeColor"

    .line 57
    .line 58
    const-string v3, "setGeometryPaintColor"

    .line 59
    .line 60
    const-string v4, "setGeometryColor"

    .line 61
    .line 62
    const-string v5, "setGeometryStrokeColor"

    .line 63
    .line 64
    const-string v6, "setGraphColor"

    .line 65
    .line 66
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-static {p2}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/String;

    .line 89
    .line 90
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v3, "getMethods(...)"

    .line 99
    .line 100
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    array-length v3, v1

    .line 104
    const/4 v4, 0x0

    .line 105
    move v5, v4

    .line 106
    :goto_4
    const/4 v6, 0x0

    .line 107
    if-ge v5, v3, :cond_1

    .line 108
    .line 109
    aget-object v7, v1, v5

    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_0

    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    array-length v8, v8

    .line 126
    const/4 v9, 0x1

    .line 127
    if-ne v8, v9, :cond_0

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    aget-object v8, v8, v4

    .line 134
    .line 135
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eqz v8, :cond_0

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :catchall_3
    move-exception v0

    .line 145
    goto :goto_6

    .line 146
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_1
    move-object v7, v6

    .line 150
    :goto_5
    if-eqz v7, :cond_2

    .line 151
    .line 152
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v7, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    :cond_2
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :goto_6
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_3
    return-void
.end method

.method private final switchPenCustomColor()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/PenToolState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenToolState;->isShowCustomColor()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    xor-int/lit8 v10, v4, 0x1

    .line 18
    .line 19
    const/16 v11, 0x3f

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    invoke-static/range {v3 .. v12}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    return-void
.end method

.method private final syncGeometryStyleIfInGeometryMode()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/view/board/board/MainToolState;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/view/board/board/MainToolState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Graph;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Graph;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_graphToolState:Lkotlinx/coroutines/flow/y;

    .line 22
    .line 23
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 24
    .line 25
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/zykj/view/board/board/GraphToolState;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/view/board/board/GraphToolState;->getGraphType()Lcom/zykj/view/board/board/GraphType;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lcom/zykj/view/board/board/GraphType$Null;->INSTANCE:Lcom/zykj/view/board/board/GraphType$Null;

    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->applyGeometryStyleFromPenState()V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method private final updateConfigAboutEraser()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_eraserToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/view/board/board/EraserToolState;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_ERASER_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/view/board/board/EraserToolState;->getEraserType()Lcom/zykj/view/board/board/EraserType;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lcom/zykj/view/board/board/EraserType;->getSize()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setEraserWidth(F)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method private final updateConfigAboutPen()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/view/board/board/PenToolState;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenType()Lcom/zykj/view/board/board/PenType;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenType;->getMode()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenType()Lcom/zykj/view/board/board/PenType;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenType;->isDotted()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v5, 0x6

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenType()Lcom/zykj/view/board/board/PenType;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenType;->getPaintWidthList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenSizeLevel()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintWidth(F)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintWidth(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenType()Lcom/zykj/view/board/board/PenType;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenType;->getPaintColorAlpha()F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v2, v3}, Lcom/zykj/view/utils/ExtKt;->withAlpha(IF)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintColor(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintColor(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpTextColor()Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-nez v3, :cond_0

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenToolState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 112
    .line 113
    .line 114
    :cond_0
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpGeometryColor()Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-nez v0, :cond_1

    .line 119
    .line 120
    invoke-direct {p0, v1, v2}, Lcom/zykj/view/board/board/BoardViewModel;->setGeometryColorCompat(Lcom/zykj/blackboard/bean/BoardConfig;I)V

    .line 121
    .line 122
    .line 123
    :cond_1
    return-void
.end method

.method private final updateConfigAboutSelect()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_selectToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/view/board/board/SelectToolState;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getPenSelected()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getHighlighterSelected()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE_HIGHLIGHTER:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getImageSelected()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->IMAGE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getTextSelected()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->TEXT:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getGeometrySelected()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    sget-object v0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->GEOMETRY:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectIncludeGraphEnumListByDrag(Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    invoke-static {v1}, Lcom/zykj/view/utils/SPDataKt;->setSpSelectGraphEnum(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public static synthetic updateMicroPhone$default(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 6
    .line 7
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/view/board/board/RecordState;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/board/board/RecordState;->isMicrophoneOn()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    xor-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateMicroPhone(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic updateTouchable$default(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 6
    .line 7
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/view/board/board/MainToolState;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/board/board/MainToolState;->isTouchable()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    xor-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateTouchable(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final addBitmapList(Ljava/util/List;Z)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "pathList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZLh6/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final addImageGraph(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;)V
    .locals 10
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
            "Z",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "scaleTypeEnum"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filename"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    move-object v2, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v6, p2

    .line 21
    move-object v5, p3

    .line 22
    move v8, p4

    .line 23
    move-object v4, p5

    .line 24
    move-object/from16 v7, p6

    .line 25
    .line 26
    invoke-direct/range {v1 .. v9}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lr6/c;ZLh6/c;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-static {v0, p2, p2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final addText(Ljava/lang/String;)V
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v3, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->CENTER:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 14
    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v2, p1

    .line 19
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->addText$default(Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 26
    .line 27
    :cond_1
    move-object v2, v0

    .line 28
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 29
    .line 30
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, Lcom/zykj/view/board/board/MainToolState;

    .line 36
    .line 37
    sget-object v10, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 38
    .line 39
    const/16 v11, 0x1f

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    invoke-static/range {v4 .. v12}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_0
    return-void
.end method

.method public final areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final areaMoveStart()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final cleanPage()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, v1, v2}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->cleanPage$default(Lcom/zykj/blackboard/core/edit/IPageControl;Lcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final dismissAllPanelsAndSelection()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dismissCustomColorPalette()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 5
    .line 6
    :cond_0
    move-object v1, v0

    .line 7
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v3, v2

    .line 14
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 15
    .line 16
    sget-object v4, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 17
    .line 18
    const/16 v13, 0x1fe

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    :try_start_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 46
    .line 47
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v0, 0x0

    .line 56
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_1
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final dismissCustomColorPalette()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/PenToolState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenToolState;->isShowCustomColor()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v11, 0x3f

    .line 21
    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    invoke-static/range {v3 .. v12}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_0
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    return-void
.end method

.method public final dismissPanelsForCanvasTouch()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dismissCustomColorPalette()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 5
    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/view/board/board/MainToolState;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/view/board/board/MainToolState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 27
    .line 28
    :cond_0
    move-object v1, v0

    .line 29
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 30
    .line 31
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    move-object v3, v2

    .line 36
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 37
    .line 38
    sget-object v4, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 39
    .line 40
    const/16 v13, 0x1fe

    .line 41
    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x0

    .line 51
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final dismissPanelsForSelectToolbarItemClick()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dismissCustomColorPalette()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 5
    .line 6
    :cond_0
    move-object v1, v0

    .line 7
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v3, v2

    .line 14
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 15
    .line 16
    sget-object v4, Lcom/zykj/view/board/board/MinorToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Select;

    .line 17
    .line 18
    const/16 v13, 0x1fe

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    :try_start_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 46
    .line 47
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v0, 0x0

    .line 56
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_1
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final dismissPanelsForToolbarClick()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dismissCustomColorPalette()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 5
    .line 6
    :cond_0
    move-object v1, v0

    .line 7
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v3, v2

    .line 14
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 15
    .line 16
    sget-object v4, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 17
    .line 18
    const/16 v13, 0x1fe

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 40
    .line 41
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 42
    .line 43
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/zykj/view/board/board/MainToolState;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/view/board/board/MainToolState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    :try_start_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 68
    .line 69
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v0, 0x0

    .line 78
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :goto_1
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
.end method

.method public final dropDraftCache()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 9
    .line 10
    :cond_1
    move-object v3, v2

    .line 11
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 12
    .line 13
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    move-object v5, v4

    .line 18
    check-cast v5, Lcom/zykj/view/board/board/ExtraUIState;

    .line 19
    .line 20
    const/16 v15, 0x1fb

    .line 21
    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v14, 0x0

    .line 33
    invoke-static/range {v5 .. v16}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 44
    .line 45
    :cond_2
    move-object v2, v3

    .line 46
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 47
    .line 48
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    move-object v5, v4

    .line 53
    check-cast v5, Lcom/zykj/view/board/board/RecordState;

    .line 54
    .line 55
    sget-object v6, Lcom/zykj/view/board/board/RecordStatus$Init;->INSTANCE:Lcom/zykj/view/board/board/RecordStatus$Init;

    .line 56
    .line 57
    const/4 v9, 0x6

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-static/range {v5 .. v10}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v2, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    const/4 v3, 0x0

    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-static {v1, v3, v4, v2, v4}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->deletePage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ILr6/a;ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Lcom/zykj/view/board/board/l;

    .line 78
    .line 79
    const/4 v5, 0x4

    .line 80
    invoke-direct {v2, v0, v5}, Lcom/zykj/view/board/board/l;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 81
    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-static {v1, v3, v2, v5, v4}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLr6/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final getBackgroundToolState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->backgroundToolState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardCallbackConfig:Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->customColorView:Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEraserToolState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->eraserToolState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEvent()Lkotlinx/coroutines/flow/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/c0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->event:Lkotlinx/coroutines/flow/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpandState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->expandState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExtraUIState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->extraUIState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphToolState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->graphToolState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getImageCropView()Lcom/zykj/blackboard/proxy/ImageCropView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->imageCropView:Lcom/zykj/blackboard/proxy/ImageCropView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLoadFinished()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->loadFinished:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMainToolState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->mainToolState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPathListByImageGraph()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->loadFinished:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getNoRecordImagePathList()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getPenToolState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->penToolState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecordState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->recordState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecordingImagePathList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->loadFinished:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getPageImagePathList()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getSavePath(ZZLr6/e;Lr6/e;)V
    .locals 8
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lr6/e;",
            "Lr6/e;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    move-object v2, p0

    .line 19
    move v3, p1

    .line 20
    move v4, p2

    .line 21
    move-object v6, p3

    .line 22
    move-object v5, p4

    .line 23
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLr6/e;Lr6/e;Lh6/c;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-static {v0, p2, p2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final getSelectToolState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->selectToolState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextEditView()Lcom/zykj/blackboard/proxy/TextEditView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->textEditView:Lcom/zykj/blackboard/proxy/TextEditView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final handleExpandClick()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final initBoardControl(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V
    .locals 19
    .param p1    # Lcom/zykj/blackboard/core/edit/IBoardControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    const-string v4, "boardControl"

    .line 8
    .line 9
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v4, "initBoardControl Start"

    .line 13
    .line 14
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 22
    .line 23
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 24
    .line 25
    :cond_0
    move-object v5, v4

    .line 26
    check-cast v5, Lkotlinx/coroutines/flow/n0;

    .line 27
    .line 28
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    move-object v7, v6

    .line 33
    check-cast v7, Lcom/zykj/view/board/board/ExtraUIState;

    .line 34
    .line 35
    const/16 v17, 0x1fb

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    move/from16 v10, p2

    .line 49
    .line 50
    invoke-static/range {v7 .. v18}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v5, v6, v7}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    const-wide/16 v4, 0x0

    .line 61
    .line 62
    cmp-long v4, v2, v4

    .line 63
    .line 64
    if-lez v4, :cond_2

    .line 65
    .line 66
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 67
    .line 68
    :cond_1
    move-object v5, v4

    .line 69
    check-cast v5, Lkotlinx/coroutines/flow/n0;

    .line 70
    .line 71
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    move-object v7, v6

    .line 76
    check-cast v7, Lcom/zykj/view/board/board/RecordState;

    .line 77
    .line 78
    sget-object v8, Lcom/zykj/view/board/board/RecordStatus$Continue;->INSTANCE:Lcom/zykj/view/board/board/RecordStatus$Continue;

    .line 79
    .line 80
    sget-object v9, Lcom/zykj/view/utils/TimeFormatUtils;->INSTANCE:Lcom/zykj/view/utils/TimeFormatUtils;

    .line 81
    .line 82
    invoke-virtual {v9, v2, v3}, Lcom/zykj/view/utils/TimeFormatUtils;->formatTimeWithHour(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    const/4 v11, 0x2

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    invoke-static/range {v7 .. v12}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v5, v6, v7}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    :cond_2
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const/4 v3, 0x1

    .line 104
    if-eqz v2, :cond_4

    .line 105
    .line 106
    const/high16 v4, 0x42400000    # 48.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectIconWidth(F)V

    .line 109
    .line 110
    .line 111
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 112
    .line 113
    if-eqz v4, :cond_3

    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/zykj/view/board/board/BoardSketchConfig;->getMaxImageCount()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setMaxImageSize(I)V

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpTouchable()Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    xor-int/2addr v4, v3

    .line 133
    invoke-virtual {v0, v4}, Lcom/zykj/view/board/board/BoardViewModel;->updateTouchable(Z)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->initTextConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->initBackgroundLevel(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 140
    .line 141
    .line 142
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->imageCropView:Lcom/zykj/blackboard/proxy/ImageCropView;

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setImageCropView(Lcom/zykj/blackboard/proxy/ImageCropView;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->initMoveConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->initEraserSizeLevel(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->initPenConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 154
    .line 155
    .line 156
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->customColorView:Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectCustomColorView(Lcom/zykj/blackboard/proxy/CustomColorView;)V

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->initSelectConfig(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 162
    .line 163
    .line 164
    sget-object v2, Lcom/zykj/view/board/board/MainToolType$Pen;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Pen;

    .line 165
    .line 166
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->updateModeType(Lcom/zykj/view/board/board/MainToolType;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    new-instance v2, Lcom/zykj/view/board/board/k;

    .line 170
    .line 171
    const/4 v4, 0x4

    .line 172
    invoke-direct {v2, v0, v4}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/BoardViewModel;I)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-eqz v4, :cond_5

    .line 180
    .line 181
    const-string v1, "pageControl is not Null"

    .line 182
    .line 183
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4}, Lcom/zykj/view/board/board/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_5
    const-string v4, "pageControl is Null"

    .line 195
    .line 196
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    new-instance v4, Lcom/zykj/view/board/board/n;

    .line 204
    .line 205
    invoke-direct {v4, v0, v2}, Lcom/zykj/view/board/board/n;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/k;)V

    .line 206
    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    invoke-static {v1, v5, v4, v3, v2}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLr6/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 211
    .line 212
    .line 213
    :goto_0
    const-string v1, "initBoardControl Finished"

    .line 214
    .line 215
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method public final initCallbackConfig(Lcom/zykj/view/board/board/BoardCallbackConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/board/BoardCallbackConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardCallbackConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardCallbackConfig:Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 7
    .line 8
    return-void
.end method

.method public final initSketchConfig(Lcom/zykj/view/board/board/BoardSketchConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/board/BoardSketchConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardSketchConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getCurrentZoomLevelList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lcom/zykj/view/board/board/ZoomLevel$Level3;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level3;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 19
    .line 20
    return-void
.end method

.method public final initZoomPointF(FF)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    int-to-float v0, v0

    .line 3
    div-float v1, p1, v0

    .line 4
    .line 5
    div-float v0, p2, v0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->zoomPointF:Landroid/graphics/PointF;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/BoardSketchConfig;->getZoomPointSolution()Lcom/zykj/view/utils/ZoomPointSolution;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-nez v3, :cond_1

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/BoardViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    aget v3, v4, v3

    .line 30
    .line 31
    :goto_1
    const/4 v4, 0x0

    .line 32
    packed-switch v3, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    invoke-virtual {v2, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-virtual {v2, v1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_2
    invoke-virtual {v2, p1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    invoke-virtual {v2, v1, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_4
    invoke-virtual {v2, v4, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_5
    invoke-virtual {v2, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_6
    invoke-virtual {v2, v4, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_7
    invoke-virtual {v2, p1, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_8
    invoke-virtual {v2, v4, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isImageOutOfCount()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getImageGraphCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->boardSketchConfig:Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardSketchConfig;->getMaxImageCount()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v2, 0x3

    .line 24
    :goto_1
    if-lt v0, v2, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_2
    return v1
.end method

.method public final resetRevoke()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->clearHistoryListWithoutCurrent()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setCustomColorView(Lcom/zykj/blackboard/proxy/CustomColorView;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/proxy/CustomColorView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->customColorView:Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 2
    .line 3
    return-void
.end method

.method public final setImageCropView(Lcom/zykj/blackboard/proxy/ImageCropView;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/proxy/ImageCropView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->imageCropView:Lcom/zykj/blackboard/proxy/ImageCropView;

    .line 2
    .line 3
    return-void
.end method

.method public final setTextEditView(Lcom/zykj/blackboard/proxy/TextEditView;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/proxy/TextEditView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->textEditView:Lcom/zykj/blackboard/proxy/TextEditView;

    .line 2
    .line 3
    return-void
.end method

.method public final startRevoke(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->withdraw()Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->recover()Z

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final switchBackgroundTool()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Background;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Background;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v4, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v13, 0x1fe

    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    return-void
.end method

.method public final switchEraserTool()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Eraser;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Eraser;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v4, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v13, 0x1fe

    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    return-void
.end method

.method public final switchGraphTool()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Graph;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Graph;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v4, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v13, 0x1fe

    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    return-void
.end method

.method public final switchPenTool()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Pen;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Pen;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v4, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v13, 0x1fe

    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 52
    .line 53
    :cond_2
    move-object v0, v1

    .line 54
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 55
    .line 56
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v3, v2

    .line 61
    check-cast v3, Lcom/zykj/view/board/board/PenToolState;

    .line 62
    .line 63
    const/16 v11, 0x3f

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    invoke-static/range {v3 .. v12}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    return-void
.end method

.method public final switchRecordState()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isRecording()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isMicroTurnOn()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->lastIsMicroPhoneOn:Z

    .line 19
    .line 20
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->stopRecord()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->lastIsMicroPhoneOn:Z

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->startRecord(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final switchSelectTool()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/ExtraUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Select;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v4, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v13, 0x1fe

    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    return-void
.end method

.method public final updateBackgroundLevel(I)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getBackgroundTypeList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/view/board/board/BackgroundType;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_backgroundToolState:Lkotlinx/coroutines/flow/y;

    .line 12
    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 15
    .line 16
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Lcom/zykj/view/board/board/BackgroundToolState;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-static {v3, v6, p1, v4, v5}, Lcom/zykj/view/board/board/BackgroundToolState;->copy$default(Lcom/zykj/view/board/board/BackgroundToolState;ZLcom/zykj/view/board/board/BackgroundType;ILjava/lang/Object;)Lcom/zykj/view/board/board/BackgroundToolState;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBackgroundColor(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getLineColor()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineColor(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getLineSpace()F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineSpace(F)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v1, :cond_2

    .line 80
    .line 81
    :goto_0
    return-void

    .line 82
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getBackgroundColor()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eq v2, v3, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v1, v2, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setBackgroundColorWithLineConfig(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BackgroundType;->getBackgroundColor()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Lcom/zykj/view/utils/SPDataKt;->setSpBackgroundColor(Ljava/lang/Integer;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final updateEraserSizeLevel(I)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getEraserTypeList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/view/board/board/EraserType;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_eraserToolState:Lkotlinx/coroutines/flow/y;

    .line 12
    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 15
    .line 16
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Lcom/zykj/view/board/board/EraserToolState;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Lcom/zykj/view/board/board/EraserToolState;->copy(Lcom/zykj/view/board/board/EraserType;)Lcom/zykj/view/board/board/EraserToolState;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutEraser()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/view/board/board/EraserType;->getSize()F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lcom/zykj/view/utils/SPDataKt;->setSpEraserSize(Ljava/lang/Float;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final updateExpandState(Z)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZLh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final updateGraphType(Lcom/zykj/view/board/board/GraphType;)V
    .locals 11
    .param p1    # Lcom/zykj/view/board/board/GraphType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/view/board/board/MainToolType$Graph;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Graph;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateModeType(Lcom/zykj/view/board/board/MainToolType;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_graphToolState:Lkotlinx/coroutines/flow/y;

    .line 12
    .line 13
    :goto_0
    move-object v1, v0

    .line 14
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 15
    .line 16
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Lcom/zykj/view/board/board/GraphToolState;

    .line 22
    .line 23
    const/16 v9, 0xf

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v8, p1

    .line 31
    invoke-static/range {v3 .. v10}, Lcom/zykj/view/board/board/GraphToolState;->copy$default(Lcom/zykj/view/board/board/GraphToolState;ZZZZLcom/zykj/view/board/board/GraphType;ILjava/lang/Object;)Lcom/zykj/view/board/board/GraphToolState;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_GEOMETRY:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8}, Lcom/zykj/view/board/board/GraphType;->getGeometryActionEnum()Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setGeometryActionEnum(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->applyGeometryStyleFromPenState()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    move-object p1, v8

    .line 64
    goto :goto_0
.end method

.method public final updateMicroPhone(Z)V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_recordState:Lkotlinx/coroutines/flow/y;

    .line 9
    .line 10
    :goto_0
    move-object v2, v1

    .line 11
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 12
    .line 13
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    move-object v4, v3

    .line 18
    check-cast v4, Lcom/zykj/view/board/board/RecordState;

    .line 19
    .line 20
    const/4 v8, 0x5

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    move v6, p1

    .line 25
    invoke-static/range {v4 .. v9}, Lcom/zykj/view/board/board/RecordState;->copy$default(Lcom/zykj/view/board/board/RecordState;Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/RecordState;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v2, v3, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_6

    .line 34
    .line 35
    const-string p1, "toast nothing"

    .line 36
    .line 37
    const-string v1, "toast null"

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->turnOnMicro()V

    .line 43
    .line 44
    .line 45
    sget v0, Lcom/zykj/view/R$string;->turn_on_micro_phone:I

    .line 46
    .line 47
    sget-object v3, Lcom/blankj/utilcode/util/x;->b:Lcom/blankj/utilcode/util/x;

    .line 48
    .line 49
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/c;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    move-object p1, v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object p1, v0

    .line 65
    :goto_1
    new-instance v0, Lb0/a;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lb0/a;-><init>(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/blankj/utilcode/util/c0;->g(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->turnOffMicro()V

    .line 75
    .line 76
    .line 77
    sget v0, Lcom/zykj/view/R$string;->turn_off_micro_phone:I

    .line 78
    .line 79
    sget-object v3, Lcom/blankj/utilcode/util/x;->b:Lcom/blankj/utilcode/util/x;

    .line 80
    .line 81
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/c;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_4

    .line 86
    .line 87
    move-object p1, v1

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    move-object p1, v0

    .line 97
    :goto_2
    new-instance v0, Lb0/a;

    .line 98
    .line 99
    invoke-direct {v0, p1}, Lb0/a;-><init>(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lcom/blankj/utilcode/util/c0;->g(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_6
    move p1, v6

    .line 107
    goto :goto_0
.end method

.method public final updateMinorToolType(Lcom/zykj/view/board/board/MinorToolType;)V
    .locals 16
    .param p1    # Lcom/zykj/view/board/board/MinorToolType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "minorToolType"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p0

    .line 9
    .line 10
    iget-object v13, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 11
    .line 12
    :goto_0
    move-object v14, v13

    .line 13
    check-cast v14, Lkotlinx/coroutines/flow/n0;

    .line 14
    .line 15
    invoke-virtual {v14}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v15

    .line 19
    move-object v1, v15

    .line 20
    check-cast v1, Lcom/zykj/view/board/board/ExtraUIState;

    .line 21
    .line 22
    const/16 v11, 0x1fe

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v14, v15, v1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    move-object/from16 v2, p1

    .line 45
    .line 46
    goto :goto_0
.end method

.method public final updateModeType(Lcom/zykj/view/board/board/MainToolType;)V
    .locals 16
    .param p1    # Lcom/zykj/view/board/board/MainToolType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-string v1, "mainToolType"

    .line 6
    .line 7
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v10, v0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 11
    .line 12
    :cond_0
    move-object v11, v10

    .line 13
    check-cast v11, Lkotlinx/coroutines/flow/n0;

    .line 14
    .line 15
    invoke-virtual {v11}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v12

    .line 19
    move-object v1, v12

    .line 20
    check-cast v1, Lcom/zykj/view/board/board/MainToolState;

    .line 21
    .line 22
    const/16 v8, 0x1f

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-static/range {v1 .. v9}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v11, v12, v1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Graph;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Graph;

    .line 41
    .line 42
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_graphToolState:Lkotlinx/coroutines/flow/y;

    .line 49
    .line 50
    :cond_1
    move-object v2, v1

    .line 51
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 52
    .line 53
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v8, v3

    .line 58
    check-cast v8, Lcom/zykj/view/board/board/GraphToolState;

    .line 59
    .line 60
    sget-object v13, Lcom/zykj/view/board/board/GraphType$Null;->INSTANCE:Lcom/zykj/view/board/board/GraphType$Null;

    .line 61
    .line 62
    const/16 v14, 0xf

    .line 63
    .line 64
    const/4 v15, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    invoke-static/range {v8 .. v15}, Lcom/zykj/view/board/board/GraphToolState;->copy$default(Lcom/zykj/view/board/board/GraphToolState;ZZZZLcom/zykj/view/board/board/GraphType;ILjava/lang/Object;)Lcom/zykj/view/board/board/GraphToolState;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    :cond_2
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 80
    .line 81
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_NEW_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Pen;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Pen;

    .line 100
    .line 101
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutPen()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Eraser;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Eraser;

    .line 112
    .line 113
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutEraser()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    sget-object v1, Lcom/zykj/view/board/board/MainToolType$Graph;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Graph;

    .line 124
    .line 125
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    :cond_6
    return-void

    .line 132
    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 133
    .line 134
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 135
    .line 136
    .line 137
    throw v1
.end method

.method public final updatePenColorLevel(I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getPenColorList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move/from16 v2, p1

    .line 8
    .line 9
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    new-instance v1, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 18
    .line 19
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 20
    .line 21
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 22
    .line 23
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/zykj/view/board/board/PenToolState;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/zykj/view/board/board/PenToolState;->getPenCustomColor()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-direct {v1, v2}, Lcom/zykj/view/board/board/PenColor$ColorCustom;-><init>(I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 37
    .line 38
    :cond_1
    move-object v3, v2

    .line 39
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 40
    .line 41
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v5, v4

    .line 46
    check-cast v5, Lcom/zykj/view/board/board/PenToolState;

    .line 47
    .line 48
    move-object v10, v1

    .line 49
    check-cast v10, Lcom/zykj/view/board/board/PenColor;

    .line 50
    .line 51
    const/16 v13, 0x6f

    .line 52
    .line 53
    const/4 v14, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    invoke-static/range {v5 .. v14}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    instance-of v3, v1, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->switchPenCustomColor()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 79
    .line 80
    :cond_3
    move-object v2, v4

    .line 81
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 82
    .line 83
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    move-object v11, v5

    .line 88
    check-cast v11, Lcom/zykj/view/board/board/PenToolState;

    .line 89
    .line 90
    const/16 v19, 0x3f

    .line 91
    .line 92
    const/16 v20, 0x0

    .line 93
    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    const/4 v14, 0x0

    .line 97
    const/4 v15, 0x0

    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    const/16 v18, 0x0

    .line 103
    .line 104
    invoke-static/range {v11 .. v20}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v2, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    :goto_0
    if-eqz v3, :cond_5

    .line 115
    .line 116
    check-cast v1, Lcom/zykj/view/board/board/PenColor;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    return-void

    .line 126
    :cond_5
    :goto_1
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutPen()V

    .line 127
    .line 128
    .line 129
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->syncGeometryStyleIfInGeometryMode()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, Lcom/zykj/view/utils/SPDataKt;->setSpPenColor(Ljava/lang/Integer;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final updatePenCustomColor(I)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :goto_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/PenToolState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenToolState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    instance-of v4, v4, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    new-instance v4, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 22
    .line 23
    invoke-direct {v4, p1}, Lcom/zykj/view/board/board/PenColor$ColorCustom;-><init>(I)V

    .line 24
    .line 25
    .line 26
    :goto_1
    move-object v8, v4

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenToolState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    goto :goto_1

    .line 33
    :goto_2
    const/16 v11, 0x4f

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    move v9, p1

    .line 42
    invoke-static/range {v3 .. v12}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutPen()V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->syncGeometryStyleIfInGeometryMode()V

    .line 56
    .line 57
    .line 58
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lcom/zykj/view/utils/SPDataKt;->setSpPenColor(Ljava/lang/Integer;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    move p1, v9

    .line 67
    goto :goto_0
.end method

.method public final updatePenSizeLevel(I)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ILh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final updatePenType(Lcom/zykj/view/board/board/PenType;)V
    .locals 3
    .param p1    # Lcom/zykj/view/board/board/PenType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "penType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/PenType;Lh6/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final updateSelectTypeByEnum(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V
    .locals 11
    .param p1    # Lcom/zykj/blackboard/enums/SelectGraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "selectGraphEnum"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_selectToolState:Lkotlinx/coroutines/flow/y;

    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/zykj/view/board/board/SelectToolState;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getPenSelected()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getHighlighterSelected()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getImageSelected()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getTextSelected()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v0}, Lcom/zykj/view/board/board/SelectToolState;->getGeometrySelected()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget-object v5, Lcom/zykj/view/board/board/BoardViewModel$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    aget p1, v5, p1

    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    if-eq p1, v5, :cond_4

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    if-eq p1, v5, :cond_3

    .line 49
    .line 50
    const/4 v5, 0x3

    .line 51
    if-eq p1, v5, :cond_2

    .line 52
    .line 53
    const/4 v5, 0x4

    .line 54
    if-eq p1, v5, :cond_1

    .line 55
    .line 56
    const/4 v5, 0x5

    .line 57
    if-ne p1, v5, :cond_0

    .line 58
    .line 59
    xor-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    :goto_0
    move v10, v0

    .line 62
    move v6, v1

    .line 63
    move v7, v2

    .line 64
    move v8, v3

    .line 65
    move v9, v4

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 68
    .line 69
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_1
    xor-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    xor-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    xor-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    xor-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :goto_1
    if-nez v6, :cond_5

    .line 86
    .line 87
    if-nez v7, :cond_5

    .line 88
    .line 89
    if-nez v8, :cond_5

    .line 90
    .line 91
    if-nez v9, :cond_5

    .line 92
    .line 93
    if-nez v10, :cond_5

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    new-array p1, p1, [Ljava/lang/Object;

    .line 97
    .line 98
    const-string v0, "\u6700\u5c11\u9700\u8981\u9009\u4e2d\u4e00\u4e2a\u7d20\u6750\u7c7b\u578b"

    .line 99
    .line 100
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->_selectToolState:Lkotlinx/coroutines/flow/y;

    .line 105
    .line 106
    :cond_6
    move-object v0, p1

    .line 107
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 108
    .line 109
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v5, v1

    .line 114
    check-cast v5, Lcom/zykj/view/board/board/SelectToolState;

    .line 115
    .line 116
    invoke-virtual/range {v5 .. v10}, Lcom/zykj/view/board/board/SelectToolState;->copy(ZZZZZ)Lcom/zykj/view/board/board/SelectToolState;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->updateConfigAboutSelect()V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final updateTouchable(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :goto_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/board/MainToolState;

    .line 12
    .line 13
    const/16 v10, 0x2f

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    move v8, p1

    .line 22
    invoke-static/range {v3 .. v11}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, v8}, Lcom/zykj/blackboard/bean/BoardConfig;->setFingerDraw(Z)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lcom/zykj/view/utils/SPDataKt;->setSpTouchable(Ljava/lang/Boolean;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    move p1, v8

    .line 50
    goto :goto_0
.end method

.method public final updateUIByViewConfig(Lcom/zykj/view/board/board/BoardViewConfig;)V
    .locals 17
    .param p1    # Lcom/zykj/view/board/board/BoardViewConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "boardViewConfig"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_mainToolState:Lkotlinx/coroutines/flow/y;

    .line 11
    .line 12
    :cond_0
    move-object v3, v1

    .line 13
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 14
    .line 15
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    move-object v5, v4

    .line 20
    check-cast v5, Lcom/zykj/view/board/board/MainToolState;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedRevoke()Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedZoom()Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/16 v12, 0x3c

    .line 31
    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v11, 0x0

    .line 37
    invoke-static/range {v5 .. v13}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    iget-object v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->_penToolState:Lkotlinx/coroutines/flow/y;

    .line 48
    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 51
    .line 52
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    move-object v5, v4

    .line 57
    check-cast v5, Lcom/zykj/view/board/board/PenToolState;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedDot()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedPenHighlighter()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const/16 v13, 0x7c

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    invoke-static/range {v5 .. v14}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v1, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_graphToolState:Lkotlinx/coroutines/flow/y;

    .line 86
    .line 87
    :cond_2
    move-object v3, v1

    .line 88
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 89
    .line 90
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    move-object v5, v4

    .line 95
    check-cast v5, Lcom/zykj/view/board/board/GraphToolState;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedGallery()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedCamera()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedText()Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedGraph()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    const/16 v11, 0x10

    .line 114
    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v10, 0x0

    .line 117
    invoke-static/range {v5 .. v12}, Lcom/zykj/view/board/board/GraphToolState;->copy$default(Lcom/zykj/view/board/board/GraphToolState;ZZZZLcom/zykj/view/board/board/GraphType;ILjava/lang/Object;)Lcom/zykj/view/board/board/GraphToolState;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_2

    .line 126
    .line 127
    iget-object v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->_backgroundToolState:Lkotlinx/coroutines/flow/y;

    .line 128
    .line 129
    :cond_3
    move-object v1, v3

    .line 130
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 131
    .line 132
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    move-object v5, v4

    .line 137
    check-cast v5, Lcom/zykj/view/board/board/BackgroundToolState;

    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getNeedBackgroundLine()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/4 v7, 0x2

    .line 144
    const/4 v8, 0x0

    .line 145
    invoke-static {v5, v6, v8, v7, v8}, Lcom/zykj/view/board/board/BackgroundToolState;->copy$default(Lcom/zykj/view/board/board/BackgroundToolState;ZLcom/zykj/view/board/board/BackgroundType;ILjava/lang/Object;)Lcom/zykj/view/board/board/BackgroundToolState;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v1, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 156
    .line 157
    :cond_4
    move-object v3, v1

    .line 158
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 159
    .line 160
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    move-object v5, v4

    .line 165
    check-cast v5, Lcom/zykj/view/board/board/ExtraUIState;

    .line 166
    .line 167
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewConfig;->getConfirmButtonType()Lcom/zykj/view/board/board/ConfirmButtonType;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    const/16 v15, 0x1fd

    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v8, 0x0

    .line 177
    const/4 v9, 0x0

    .line 178
    const/4 v10, 0x0

    .line 179
    const/4 v11, 0x0

    .line 180
    const/4 v12, 0x0

    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    invoke-static/range {v5 .. v16}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_4

    .line 192
    .line 193
    return-void
.end method

.method public final updateZoomLevel(Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getCurrentZoomLevelList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sub-int/2addr v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 20
    .line 21
    add-int/2addr v3, v2

    .line 22
    iput v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 28
    .line 29
    if-lez v3, :cond_1

    .line 30
    .line 31
    add-int/lit8 v3, v3, -0x1

    .line 32
    .line 33
    iput v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 36
    .line 37
    if-ne v1, v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_2
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getCurrentZoomLevelList()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomLevelIndex:I

    .line 46
    .line 47
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lcom/zykj/view/board/board/ZoomLevel;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/zykj/view/board/board/ZoomLevel;->getZoomValue()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getPageControl()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_3
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->zoomPointF:Landroid/graphics/PointF;

    .line 66
    .line 67
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    invoke-interface {v3, v5, v4, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->zoomLevel(FFF)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveVerticalProgress()F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveHorizontalProgress()F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const/high16 v6, 0x3f800000    # 1.0f

    .line 83
    .line 84
    cmpl-float v7, v4, v6

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    if-lez v7, :cond_4

    .line 88
    .line 89
    move v7, v6

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    cmpg-float v7, v4, v8

    .line 92
    .line 93
    if-gez v7, :cond_5

    .line 94
    .line 95
    move v7, v8

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    move v7, v4

    .line 98
    :goto_1
    cmpl-float v9, v5, v6

    .line 99
    .line 100
    if-lez v9, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    cmpg-float v9, v5, v8

    .line 104
    .line 105
    if-gez v9, :cond_7

    .line 106
    .line 107
    move v6, v8

    .line 108
    goto :goto_2

    .line 109
    :cond_7
    cmpg-float v6, v1, v6

    .line 110
    .line 111
    if-gtz v6, :cond_8

    .line 112
    .line 113
    const/high16 v6, 0x3f000000    # 0.5f

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    move v6, v5

    .line 117
    :goto_2
    cmpg-float v4, v7, v4

    .line 118
    .line 119
    if-nez v4, :cond_9

    .line 120
    .line 121
    cmpg-float v4, v6, v5

    .line 122
    .line 123
    if-nez v4, :cond_9

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_9
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 127
    .line 128
    .line 129
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-interface {v3, v4, v5}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 138
    .line 139
    .line 140
    :goto_3
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-nez v3, :cond_a

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    int-to-float v2, v2

    .line 148
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    int-to-float v4, v4

    .line 157
    mul-float/2addr v4, v1

    .line 158
    div-float v11, v2, v4

    .line 159
    .line 160
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    int-to-float v3, v3

    .line 169
    mul-float/2addr v3, v1

    .line 170
    div-float v14, v2, v3

    .line 171
    .line 172
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->_extraUIState:Lkotlinx/coroutines/flow/y;

    .line 173
    .line 174
    :cond_b
    move-object v2, v1

    .line 175
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 176
    .line 177
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    move-object v5, v3

    .line 182
    check-cast v5, Lcom/zykj/view/board/board/ExtraUIState;

    .line 183
    .line 184
    const/16 v15, 0xdf

    .line 185
    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    const/4 v7, 0x0

    .line 190
    const/4 v8, 0x0

    .line 191
    const/4 v9, 0x0

    .line 192
    const/4 v10, 0x0

    .line 193
    const/4 v12, 0x0

    .line 194
    const/4 v13, 0x0

    .line 195
    invoke-static/range {v5 .. v16}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_b

    .line 204
    .line 205
    :goto_4
    return-void
.end method
