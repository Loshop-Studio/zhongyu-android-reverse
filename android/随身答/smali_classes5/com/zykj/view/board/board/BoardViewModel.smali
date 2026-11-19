.class public final Lcom/zykj/view/board/board/BoardViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/BoardViewModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000cJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0008J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0008J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0008J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0008J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0008J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0008J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0008J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008!\u0010\u0003J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u001d\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'\u00a2\u0006\u0004\u0008*\u0010+J)\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0008\u0008\u0002\u0010/\u001a\u00020.2\u0008\u0008\u0002\u00101\u001a\u000200\u00a2\u0006\u0004\u00082\u00103J\u0015\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\u00086\u00107J\u0015\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208\u00a2\u0006\u0004\u0008:\u0010;J\u0015\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@\u00a2\u0006\u0004\u0008B\u0010CJ\u0015\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020.\u00a2\u0006\u0004\u0008E\u0010FJ\u0017\u0010H\u001a\u00020\u00062\u0008\u0008\u0002\u0010G\u001a\u00020.\u00a2\u0006\u0004\u0008H\u0010FJ\u0015\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020.\u00a2\u0006\u0004\u0008J\u0010FJ\r\u0010K\u001a\u00020\u0006\u00a2\u0006\u0004\u0008K\u0010\u0003J\r\u0010L\u001a\u00020\u0006\u00a2\u0006\u0004\u0008L\u0010\u0003J\r\u0010M\u001a\u00020\u0006\u00a2\u0006\u0004\u0008M\u0010\u0003J\r\u0010N\u001a\u00020\u0006\u00a2\u0006\u0004\u0008N\u0010\u0003J\r\u0010O\u001a\u00020\u0006\u00a2\u0006\u0004\u0008O\u0010\u0003J\r\u0010P\u001a\u00020\u0006\u00a2\u0006\u0004\u0008P\u0010\u0003J\r\u0010Q\u001a\u00020\u0006\u00a2\u0006\u0004\u0008Q\u0010\u0003J\u0015\u0010T\u001a\u00020\u00062\u0006\u0010S\u001a\u00020R\u00a2\u0006\u0004\u0008T\u0010UJ\u0015\u0010X\u001a\u00020\u00062\u0006\u0010W\u001a\u00020V\u00a2\u0006\u0004\u0008X\u0010YJ\u0015\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#\u00a2\u0006\u0004\u0008[\u0010\\J\u0015\u0010]\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#\u00a2\u0006\u0004\u0008]\u0010\\J\u0015\u0010^\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008^\u0010\\J\r\u0010_\u001a\u00020\u0006\u00a2\u0006\u0004\u0008_\u0010\u0003J\r\u0010`\u001a\u00020\u0006\u00a2\u0006\u0004\u0008`\u0010\u0003J\r\u0010a\u001a\u00020\u0006\u00a2\u0006\u0004\u0008a\u0010\u0003J\r\u0010b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008b\u0010\u0003J\u0015\u0010c\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#\u00a2\u0006\u0004\u0008c\u0010\\J\u0015\u0010f\u001a\u00020\u00062\u0006\u0010e\u001a\u00020d\u00a2\u0006\u0004\u0008f\u0010gJ]\u0010r\u001a\u00020\u00062\n\u0008\u0002\u0010i\u001a\u0004\u0018\u00010h2\n\u0008\u0002\u0010k\u001a\u0004\u0018\u00010j2\u0008\u0008\u0002\u0010m\u001a\u00020l2\u0008\u0008\u0002\u0010n\u001a\u00020.2\u0008\u0008\u0002\u0010o\u001a\u00020j2\u0018\u0008\u0002\u0010q\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010j\u0012\u0004\u0012\u00020\u0006\u0018\u00010p\u00a2\u0006\u0004\u0008r\u0010sJ%\u0010v\u001a\u00020\u00062\u000c\u0010u\u001a\u0008\u0012\u0004\u0012\u00020j0t2\u0008\u0008\u0002\u0010n\u001a\u00020.\u00a2\u0006\u0004\u0008v\u0010wJ\u0015\u0010y\u001a\u00020\u00062\u0006\u0010x\u001a\u00020j\u00a2\u0006\u0004\u0008y\u0010zJ\u0015\u0010{\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#\u00a2\u0006\u0004\u0008{\u0010\\J\r\u0010|\u001a\u00020\u0006\u00a2\u0006\u0004\u0008|\u0010\u0003J&\u0010\u007f\u001a\u00020\u00062\n\u0008\u0002\u0010}\u001a\u0004\u0018\u00010\'2\n\u0008\u0002\u0010~\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J(\u0010\u0081\u0001\u001a\u00020\u00062\n\u0008\u0002\u0010}\u001a\u0004\u0018\u00010\'2\n\u0008\u0002\u0010~\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0080\u0001J\u000f\u0010\u0082\u0001\u001a\u00020\u0006\u00a2\u0006\u0005\u0008\u0082\u0001\u0010\u0003J\u001a\u0010\u0084\u0001\u001a\u00020\u00062\t\u0008\u0002\u0010\u0083\u0001\u001a\u00020.\u00a2\u0006\u0005\u0008\u0084\u0001\u0010FJ\u000f\u0010\u0085\u0001\u001a\u00020\u0006\u00a2\u0006\u0005\u0008\u0085\u0001\u0010\u0003J\u0018\u0010\u0087\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020.\u00a2\u0006\u0005\u0008\u0087\u0001\u0010FJ{\u0010\u0090\u0001\u001a\u00020\u00062\t\u0008\u0002\u0010\u0088\u0001\u001a\u00020.2\t\u0008\u0002\u0010\u0089\u0001\u001a\u00020.2)\u0008\u0002\u0010\u008e\u0001\u001a\"\u0008\u0001\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u008c\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008a\u00012(\u0008\u0002\u0010\u008f\u0001\u001a!\u0008\u0001\u0012\u0004\u0012\u00020j\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u008c\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008a\u0001\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J\u0016\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020j0t\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u001a\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001R-\u0010=\u001a\u0004\u0018\u00010<2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010<8\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u001a\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001R,\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001\"\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001R,\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u00a5\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001\"\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001R,\u0010\u00b4\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001\u001a\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001\"\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001R\u0018\u0010\u00b6\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00b5\u0001\u0010PR\u0018\u0010\u00ba\u0001\u001a\u00030\u00b7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001R\u001f\u0010\u00bf\u0001\u001a\n\u0012\u0005\u0012\u00030\u00bc\u00010\u00bb\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R$\u0010\u00c5\u0001\u001a\n\u0012\u0005\u0012\u00030\u00bc\u00010\u00c0\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001\u001a\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u001f\u0010\u00ca\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c7\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001R$\u0010\u00d0\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c7\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R\u001f\u0010\u00d3\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d1\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u00c9\u0001R$\u0010\u00d6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d1\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00d4\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00d5\u0001\u0010\u00cf\u0001R\u001f\u0010\u00d9\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d7\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d8\u0001\u0010\u00c9\u0001R$\u0010\u00dc\u0001\u001a\n\u0012\u0005\u0012\u00030\u00d7\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00da\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00db\u0001\u0010\u00cf\u0001R\u001f\u0010\u00df\u0001\u001a\n\u0012\u0005\u0012\u00030\u00dd\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00c9\u0001R$\u0010\u00e2\u0001\u001a\n\u0012\u0005\u0012\u00030\u00dd\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e0\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00e1\u0001\u0010\u00cf\u0001R\u001f\u0010\u00e5\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e3\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0001\u0010\u00c9\u0001R$\u0010\u00e8\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e3\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00e6\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00e7\u0001\u0010\u00cf\u0001R\u001f\u0010\u00eb\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e9\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ea\u0001\u0010\u00c9\u0001R$\u0010\u00ee\u0001\u001a\n\u0012\u0005\u0012\u00030\u00e9\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ec\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00ed\u0001\u0010\u00cf\u0001R\u001f\u0010\u00f1\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ef\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f0\u0001\u0010\u00c9\u0001R$\u0010\u00f4\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ef\u00010\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00f2\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00f3\u0001\u0010\u00cf\u0001R\u001e\u0010\u00f6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00f5\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008v\u0010\u00c9\u0001R#\u0010\u00f8\u0001\u001a\n\u0012\u0005\u0012\u00030\u00f5\u00010\u00cb\u00018\u0006\u00a2\u0006\u000f\n\u0005\u0008r\u0010\u00cd\u0001\u001a\u0006\u0008\u00f7\u0001\u0010\u00cf\u0001R\u001f\u0010\u00fb\u0001\u001a\n\u0012\u0005\u0012\u00030\u00f9\u00010\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fa\u0001\u0010\u00c9\u0001R#\u0010\u00fd\u0001\u001a\n\u0012\u0005\u0012\u00030\u00f9\u00010\u00cb\u00018\u0006\u00a2\u0006\u000f\n\u0005\u0008y\u0010\u00cd\u0001\u001a\u0006\u0008\u00fc\u0001\u0010\u00cf\u0001R\u001d\u0010\u00fe\u0001\u001a\t\u0012\u0004\u0012\u00020.0\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008 \u0010\u00c9\u0001R#\u0010\u0080\u0002\u001a\t\u0012\u0004\u0012\u00020.0\u00cb\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0081\u0001\u0010\u00cd\u0001\u001a\u0006\u0008\u00ff\u0001\u0010\u00cf\u0001R\u0019\u0010\u0082\u0002\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0002\u0010\u00ce\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0085\u0002\u0010\u0086\u0002R\u001e\u0010\u0089\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020t8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0088\u0002\u0010\u0093\u0001R\u0014\u0010\u008c\u0002\u001a\u00020.8F\u00a2\u0006\u0008\u001a\u0006\u0008\u008a\u0002\u0010\u008b\u0002\u00a8\u0006\u008d\u0002"
    }
    d2 = {
        "Lcom/zykj/view/board/board/BoardViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "Ld5/k;",
        "pageControl",
        "",
        "A0",
        "(Ld5/k;)V",
        "Lv4/b;",
        "boardConfig",
        "r0",
        "(Lv4/b;)V",
        "I0",
        "B0",
        "N0",
        "m0",
        "z0",
        "w0",
        "C0",
        "x0",
        "K0",
        "u0",
        "i0",
        "s0",
        "G0",
        "Q0",
        "R0",
        "i1",
        "a1",
        "h1",
        "g1",
        "C",
        "e1",
        "config",
        "",
        "color",
        "T0",
        "(Lv4/b;I)V",
        "",
        "right",
        "bottom",
        "O0",
        "(FF)V",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "boardControl",
        "",
        "haveCache",
        "",
        "duration",
        "n0",
        "(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V",
        "Lcom/zykj/view/board/board/f;",
        "boardViewConfig",
        "w1",
        "(Lcom/zykj/view/board/board/f;)V",
        "Lb7/i1;",
        "boardSketchConfig",
        "J0",
        "(Lb7/i1;)V",
        "Lb7/a;",
        "boardCallbackConfig",
        "q0",
        "(Lb7/a;)V",
        "Lcom/zykj/view/board/board/s;",
        "mainToolType",
        "o1",
        "(Lcom/zykj/view/board/board/s;)V",
        "isRecover",
        "W0",
        "(Z)V",
        "isTouchable",
        "u1",
        "isZoomUp",
        "x1",
        "d1",
        "b1",
        "Y0",
        "Z0",
        "X0",
        "I",
        "h0",
        "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
        "selectGraphEnum",
        "t1",
        "(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V",
        "Lcom/zykj/view/board/board/w;",
        "penType",
        "s1",
        "(Lcom/zykj/view/board/board/w;)V",
        "level",
        "r1",
        "(I)V",
        "p1",
        "q1",
        "J",
        "K",
        "M",
        "L",
        "j1",
        "Lcom/zykj/view/board/board/q;",
        "graphType",
        "l1",
        "(Lcom/zykj/view/board/board/q;)V",
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
        "z",
        "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "",
        "pathList",
        "y",
        "(Ljava/util/List;Z)V",
        "content",
        "B",
        "(Ljava/lang/String;)V",
        "f1",
        "F",
        "horizontalProgress",
        "verticalProgress",
        "G",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "D",
        "c1",
        "isMicroPhoneOn",
        "m1",
        "N",
        "isOpen",
        "k1",
        "needClear",
        "isContentThumbnail",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/coroutines/Continuation;",
        "",
        "error",
        "callback",
        "e0",
        "(ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V",
        "d0",
        "()Ljava/util/List;",
        "a",
        "Lb7/i1;",
        "value",
        "b",
        "Lb7/a;",
        "Q",
        "()Lb7/a;",
        "c",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "Lt5/c;",
        "d",
        "Lt5/c;",
        "getTextEditView",
        "()Lt5/c;",
        "V0",
        "(Lt5/c;)V",
        "textEditView",
        "Lt5/b;",
        "e",
        "Lt5/b;",
        "getImageCropView",
        "()Lt5/b;",
        "U0",
        "(Lt5/b;)V",
        "imageCropView",
        "Lt5/a;",
        "f",
        "Lt5/a;",
        "getCustomColorView",
        "()Lt5/a;",
        "S0",
        "(Lt5/a;)V",
        "customColorView",
        "g",
        "zoomLevelIndex",
        "Landroid/graphics/PointF;",
        "h",
        "Landroid/graphics/PointF;",
        "zoomPointF",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/zykj/view/board/board/c;",
        "i",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_event",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "j",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "U",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "event",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/view/board/board/r;",
        "k",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "_mainToolState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "l",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Z",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "mainToolState",
        "Lb7/f2;",
        "m",
        "_selectToolState",
        "n",
        "g0",
        "selectToolState",
        "Lcom/zykj/view/board/board/v;",
        "o",
        "_penToolState",
        "p",
        "b0",
        "penToolState",
        "Lcom/zykj/view/board/board/k;",
        "q",
        "_eraserToolState",
        "r",
        "T",
        "eraserToolState",
        "Lcom/zykj/view/board/board/p;",
        "s",
        "_graphToolState",
        "t",
        "X",
        "graphToolState",
        "Lcom/zykj/view/board/board/a;",
        "u",
        "_backgroundToolState",
        "v",
        "P",
        "backgroundToolState",
        "Lcom/zykj/view/board/board/o;",
        "w",
        "_extraUIState",
        "x",
        "W",
        "extraUIState",
        "Lcom/zykj/view/board/board/x;",
        "_recordState",
        "c0",
        "recordState",
        "Lcom/zykj/view/board/board/m;",
        "A",
        "_expandState",
        "V",
        "expandState",
        "_loadFinished",
        "Y",
        "loadFinished",
        "E",
        "lastIsMicroPhoneOn",
        "a0",
        "()Ld5/k;",
        "R",
        "()Lv4/b;",
        "Lcom/zykj/view/board/board/z;",
        "S",
        "currentZoomLevelList",
        "P0",
        "()Z",
        "isImageOutOfCount",
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
.field public final A:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final B:Lkotlinx/coroutines/flow/StateFlow;

.field public final C:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final D:Lkotlinx/coroutines/flow/StateFlow;

.field public E:Z

.field public a:Lb7/i1;

.field public b:Lb7/a;

.field public c:Lcom/zykj/blackboard/core/edit/IBoardControl;

.field public d:Lt5/c;

.field public e:Lt5/b;

.field public f:Lt5/a;

.field public g:I

.field public final h:Landroid/graphics/PointF;

.field public final i:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final j:Lkotlinx/coroutines/flow/SharedFlow;

.field public final k:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final l:Lkotlinx/coroutines/flow/StateFlow;

.field public final m:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final n:Lkotlinx/coroutines/flow/StateFlow;

.field public final o:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final p:Lkotlinx/coroutines/flow/StateFlow;

.field public final q:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final r:Lkotlinx/coroutines/flow/StateFlow;

.field public final s:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final t:Lkotlinx/coroutines/flow/StateFlow;

.field public final u:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final v:Lkotlinx/coroutines/flow/StateFlow;

.field public final w:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final x:Lkotlinx/coroutines/flow/StateFlow;

.field public final y:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final z:Lkotlinx/coroutines/flow/StateFlow;


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
    invoke-static {}, Lcom/zykj/view/board/board/j;->e()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/zykj/view/board/board/z$d;->c:Lcom/zykj/view/board/board/z$d;

    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iput v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->h:Landroid/graphics/PointF;

    .line 24
    .line 25
    const/4 v1, 0x7

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v2, v2, v3, v1, v3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->i:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 33
    .line 34
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->j:Lkotlinx/coroutines/flow/SharedFlow;

    .line 39
    .line 40
    new-instance v4, Lcom/zykj/view/board/board/r;

    .line 41
    .line 42
    const/16 v11, 0x3f

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v5, 0x0

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
    invoke-direct/range {v4 .. v12}, Lcom/zykj/view/board/board/r;-><init>(ZZZZZLcom/zykj/view/board/board/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 59
    .line 60
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->l:Lkotlinx/coroutines/flow/StateFlow;

    .line 65
    .line 66
    new-instance v4, Lb7/f2;

    .line 67
    .line 68
    const/16 v10, 0x1f

    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    invoke-direct/range {v4 .. v11}, Lb7/f2;-><init>(ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 79
    .line 80
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->n:Lkotlinx/coroutines/flow/StateFlow;

    .line 85
    .line 86
    new-instance v4, Lcom/zykj/view/board/board/v;

    .line 87
    .line 88
    const/16 v12, 0x7f

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    invoke-direct/range {v4 .. v13}, Lcom/zykj/view/board/board/v;-><init>(ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 103
    .line 104
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->p:Lkotlinx/coroutines/flow/StateFlow;

    .line 109
    .line 110
    new-instance v1, Lcom/zykj/view/board/board/k;

    .line 111
    .line 112
    const/4 v4, 0x1

    .line 113
    invoke-direct {v1, v3, v4, v3}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 121
    .line 122
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->r:Lkotlinx/coroutines/flow/StateFlow;

    .line 127
    .line 128
    new-instance v5, Lcom/zykj/view/board/board/p;

    .line 129
    .line 130
    const/16 v11, 0x1f

    .line 131
    .line 132
    const/4 v12, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    invoke-direct/range {v5 .. v12}, Lcom/zykj/view/board/board/p;-><init>(ZZZZLcom/zykj/view/board/board/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 144
    .line 145
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->t:Lkotlinx/coroutines/flow/StateFlow;

    .line 150
    .line 151
    new-instance v1, Lcom/zykj/view/board/board/a;

    .line 152
    .line 153
    const/4 v5, 0x3

    .line 154
    invoke-direct {v1, v2, v3, v5, v3}, Lcom/zykj/view/board/board/a;-><init>(ZLcom/zykj/view/board/board/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->u:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 162
    .line 163
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->v:Lkotlinx/coroutines/flow/StateFlow;

    .line 168
    .line 169
    new-instance v5, Lcom/zykj/view/board/board/o;

    .line 170
    .line 171
    const/16 v15, 0x1ff

    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v12, 0x0

    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    invoke-direct/range {v5 .. v16}, Lcom/zykj/view/board/board/o;-><init>(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 190
    .line 191
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->x:Lkotlinx/coroutines/flow/StateFlow;

    .line 196
    .line 197
    new-instance v5, Lcom/zykj/view/board/board/x;

    .line 198
    .line 199
    const/4 v9, 0x7

    .line 200
    const/4 v10, 0x0

    .line 201
    const/4 v7, 0x0

    .line 202
    const/4 v8, 0x0

    .line 203
    invoke-direct/range {v5 .. v10}, Lcom/zykj/view/board/board/x;-><init>(Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 211
    .line 212
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->z:Lkotlinx/coroutines/flow/StateFlow;

    .line 217
    .line 218
    new-instance v1, Lcom/zykj/view/board/board/m;

    .line 219
    .line 220
    invoke-direct {v1, v3, v4, v3}, Lcom/zykj/view/board/board/m;-><init>(Lcom/zykj/view/board/board/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->A:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 228
    .line 229
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->B:Lkotlinx/coroutines/flow/StateFlow;

    .line 234
    .line 235
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->C:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 242
    .line 243
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->D:Lkotlinx/coroutines/flow/StateFlow;

    .line 248
    .line 249
    iput-boolean v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->E:Z

    .line 250
    .line 251
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
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
    sget-object p3, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->g:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

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
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/view/board/board/BoardViewModel;->z(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final D0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/x;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/view/board/board/y$c;->f:Lcom/zykj/view/board/board/y$c;

    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p0, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

.method public static synthetic E(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->D(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final E0(Lcom/zykj/view/board/board/BoardViewModel;J)Lkotlin/Unit;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/x;

    .line 9
    .line 10
    sget-object v2, Lm7/r;->a:Lm7/r;

    .line 11
    .line 12
    invoke-virtual {v2, p1, p2}, Lm7/r;->b(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p0, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method

.method public static final F0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/x;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/view/board/board/y$a;->f:Lcom/zykj/view/board/board/y$a;

    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p0, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

.method public static synthetic H(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->G(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final H0(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lkotlin/Unit;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/r;

    .line 9
    .line 10
    const/16 v9, 0x33

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move v5, p1

    .line 18
    move v6, p2

    .line 19
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/r;->b(Lcom/zykj/view/board/board/r;ZZZZZLcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->Q0()V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    move p1, v5

    .line 36
    move p2, v6

    .line 37
    goto :goto_0
.end method

.method public static final L0(Lcom/zykj/view/board/board/BoardViewModel;I)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lm7/q;->s(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lv4/b;->V(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final M0(Lcom/zykj/view/board/board/BoardViewModel;F)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lm7/q;->t(Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lv4/b;->Y(F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final O(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/board/BoardViewModel;->A0(Ld5/k;)V

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
    invoke-static {v0, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method

.method public static synthetic a(Lcom/zykj/view/board/board/BoardViewModel;F)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->M0(Lcom/zykj/view/board/board/BoardViewModel;F)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/BoardViewModel;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->L0(Lcom/zykj/view/board/board/BoardViewModel;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/view/board/board/BoardViewModel;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->y0(Lcom/zykj/view/board/board/BoardViewModel;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/view/board/board/BoardViewModel;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->v0(Lcom/zykj/view/board/board/BoardViewModel;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->t0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->j0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lcom/zykj/view/board/board/BoardViewModel;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lb7/i1;->c()Z

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
    iget-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, Lb7/i1;->g()Z

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
    invoke-direct {p3, v0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$1;-><init>(Lkotlin/coroutines/Continuation;)V

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
    invoke-direct {p4, v0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 46
    .line 47
    .line 48
    :cond_5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardViewModel;->e0(ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->H0(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/view/board/board/BoardViewModel;J)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->E0(Lcom/zykj/view/board/board/BoardViewModel;J)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->l0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->F0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 13

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    const/16 v11, 0x1b7

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {p0, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->p0(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k0(Lcom/zykj/view/board/board/BoardViewModel;FF)Lkotlin/Unit;
    .locals 13

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    const/16 v11, 0x16f

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    move v6, p1

    .line 21
    move v9, p2

    .line 22
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    move p1, v6

    .line 36
    move p2, v9

    .line 37
    goto :goto_0
.end method

.method public static synthetic l(Lcom/zykj/view/board/board/BoardViewModel;FF)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->k0(Lcom/zykj/view/board/board/BoardViewModel;FF)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final l0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 13

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    const/16 v11, 0x1b7

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {p0, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->O(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/view/board/board/BoardViewModel;Ld5/k;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->o0(Lcom/zykj/view/board/board/BoardViewModel;Ld5/k;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n1(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/view/board/board/x;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/view/board/board/x;->e()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    xor-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->m1(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->D0(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lcom/zykj/view/board/board/BoardViewModel;Ld5/k;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->A0(Ld5/k;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->C:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->b:Lb7/a;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lb7/a;->h()Lkotlin/jvm/functions/Function0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IBoardControl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final p0(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/view/board/board/BoardViewModel;)Ld5/k;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->i:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->A:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final t0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lkotlin/Unit;
    .locals 12

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    :cond_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Lcom/zykj/view/board/board/o;

    .line 14
    .line 15
    const/16 v10, 0x1fb

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    invoke-static/range {v0 .. v11}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p0, p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final v0(Lcom/zykj/view/board/board/BoardViewModel;I)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lm7/q;->n(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lv4/b;->h0(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->e1()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic v1(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/view/board/board/r;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/view/board/board/r;->g()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    xor-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->u1(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic w(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->e1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->h1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final y0(Lcom/zykj/view/board/board/BoardViewModel;Z)Lkotlin/Unit;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/x;

    .line 9
    .line 10
    const/4 v5, 0x5

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move v3, p1

    .line 15
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    move p1, v3

    .line 29
    goto :goto_0
.end method


# virtual methods
.method public final A0(Ld5/k;)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->w0(Ld5/k;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->C0(Ld5/k;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->x0(Ld5/k;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->K0(Ld5/k;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->u0(Ld5/k;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->i0(Ld5/k;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->s0(Ld5/k;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->G0(Ld5/k;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->Q0()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R0()V

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final B(Ljava/lang/String;)V
    .locals 12

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    sget-object v3, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->f:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

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
    invoke-static/range {v1 .. v6}, Ld5/k$a;->c(Ld5/k;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Lh5/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 26
    .line 27
    :cond_1
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lcom/zykj/view/board/board/r;

    .line 33
    .line 34
    sget-object v9, Lcom/zykj/view/board/board/s$d;->e:Lcom/zykj/view/board/board/s$d;

    .line 35
    .line 36
    const/16 v10, 0x1f

    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    invoke-static/range {v3 .. v11}, Lcom/zykj/view/board/board/r;->b(Lcom/zykj/view/board/board/r;ZZZZZLcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/r;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, Lg5/a;->getId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {v1, p1}, Ld5/k;->F(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
.end method

.method public final B0(Lv4/b;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    invoke-static {}, Lm7/q;->d()Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Lm7/c;->g(I)Lcom/zykj/view/board/board/u;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    move-object v6, v2

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    sget-object v2, Lcom/zykj/view/board/board/u$a;->c:Lcom/zykj/view/board/board/u$a;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_2
    instance-of v2, v6, Lcom/zykj/view/board/board/u$b;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v6}, Lcom/zykj/view/board/board/u;->a()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    :goto_3
    move v7, v2

    .line 42
    goto :goto_4

    .line 43
    :cond_3
    new-instance v2, Lcom/zykj/view/board/board/u$b;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct {v2, v3, v4, v5}, Lcom/zykj/view/board/board/u$b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->a()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    goto :goto_3

    .line 55
    :goto_4
    invoke-static {}, Lcom/zykj/view/board/board/j;->d()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {}, Lm7/q;->f()Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    goto :goto_5

    .line 70
    :cond_4
    move v4, v3

    .line 71
    :goto_5
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    move-object v4, v2

    .line 76
    check-cast v4, Lcom/zykj/view/board/board/w;

    .line 77
    .line 78
    invoke-static {}, Lm7/q;->e()Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    :cond_5
    move v5, v3

    .line 89
    const/16 v9, 0x43

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v2, 0x0

    .line 93
    const/4 v3, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    invoke-static/range {v1 .. v10}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    return-void
.end method

.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/v;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->h()Lcom/zykj/view/board/board/w;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/zykj/view/board/board/w;->d()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->g()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Lv4/b;->n0(F)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lv4/b;->b0(F)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lm7/q;->c()Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->e()Lcom/zykj/view/board/board/u;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->a()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->h()Lcom/zykj/view/board/board/w;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/zykj/view/board/board/w;->c()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v2, v0}, Lm7/c;->h(IF)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p0, v1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->T0(Lv4/b;I)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void
.end method

.method public final C0(Ld5/k;)V
    .locals 3

    .line 1
    new-instance v0, Lb7/u1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/u1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lb7/v1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lb7/v1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lb7/w1;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lb7/w1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v1, v2}, Lb7/e2;->f(Ld5/k;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final D(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Ld5/k;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ld5/k;->areaMoveStart()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final G(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Ld5/k;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final G0(Ld5/k;)V
    .locals 1

    .line 1
    new-instance v0, Lb7/r1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/r1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lb7/e2;->a(Ld5/k;Lkotlin/jvm/functions/Function2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final I()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    invoke-static {v0, v2, v1, v2}, Ld5/k$a;->e(Ld5/k;Lg5/c;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final I0(Lv4/b;)V
    .locals 12

    .line 1
    invoke-static {}, Lm7/q;->g()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lq5/a;->b()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-virtual {p1, v0}, Lv4/b;->r0(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 15
    .line 16
    :cond_1
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Lb7/f2;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    move v5, v4

    .line 30
    move v6, v5

    .line 31
    move v7, v6

    .line 32
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-eqz v9, :cond_7

    .line 37
    .line 38
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    check-cast v9, Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 43
    .line 44
    sget-object v10, Lcom/zykj/view/board/board/BoardViewModel$a;->b:[I

    .line 45
    .line 46
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    aget v9, v10, v9

    .line 51
    .line 52
    const/4 v10, 0x1

    .line 53
    if-eq v9, v10, :cond_6

    .line 54
    .line 55
    const/4 v11, 0x2

    .line 56
    if-eq v9, v11, :cond_5

    .line 57
    .line 58
    const/4 v11, 0x3

    .line 59
    if-eq v9, v11, :cond_4

    .line 60
    .line 61
    const/4 v11, 0x4

    .line 62
    if-eq v9, v11, :cond_3

    .line 63
    .line 64
    const/4 v7, 0x5

    .line 65
    if-ne v9, v7, :cond_2

    .line 66
    .line 67
    move v7, v10

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 70
    .line 71
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_3
    move v6, v10

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move v5, v10

    .line 78
    goto :goto_0

    .line 79
    :cond_5
    move v4, v10

    .line 80
    goto :goto_0

    .line 81
    :cond_6
    move v3, v10

    .line 82
    goto :goto_0

    .line 83
    :cond_7
    invoke-virtual/range {v2 .. v7}, Lb7/f2;->a(ZZZZZ)Lb7/f2;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {p1, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    return-void
.end method

.method public final J()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/v;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v10, 0x3f

    .line 18
    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    invoke-static/range {v2 .. v11}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    return-void
.end method

.method public final J0(Lb7/i1;)V
    .locals 1

    .line 1
    const-string v0, "boardSketchConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lcom/zykj/view/board/board/z$d;->c:Lcom/zykj/view/board/board/z$d;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 19
    .line 20
    return-void
.end method

.method public final K()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 5
    .line 6
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/view/board/board/r;->c()Lcom/zykj/view/board/board/s;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/zykj/view/board/board/s$d;->e:Lcom/zykj/view/board/board/s$d;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 25
    .line 26
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 32
    .line 33
    sget-object v3, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 34
    .line 35
    const/16 v12, 0x1fe

    .line 36
    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final K0(Ld5/k;)V
    .locals 2

    .line 1
    new-instance v0, Lb7/x1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/x1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lb7/k1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lb7/k1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0, v1}, Lb7/e2;->g(Ld5/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final L()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 5
    .line 6
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 12
    .line 13
    sget-object v3, Lcom/zykj/view/board/board/t$f;->f:Lcom/zykj/view/board/board/t$f;

    .line 14
    .line 15
    const/16 v12, 0x1fe

    .line 16
    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, v1}, Ld5/k;->F(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 62
    .line 63
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final M()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 5
    .line 6
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 12
    .line 13
    sget-object v3, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 14
    .line 15
    const/16 v12, 0x1fe

    .line 16
    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 37
    .line 38
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/zykj/view/board/board/r;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/view/board/board/r;->c()Lcom/zykj/view/board/board/s;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lcom/zykj/view/board/board/s$d;->e:Lcom/zykj/view/board/board/s$d;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v0, v1}, Ld5/k;->F(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const/4 v0, 0x0

    .line 77
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
.end method

.method public final N()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    move-object v3, v2

    .line 13
    check-cast v3, Lcom/zykj/view/board/board/o;

    .line 14
    .line 15
    const/16 v13, 0x1fb

    .line 16
    .line 17
    const/4 v14, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 38
    .line 39
    :cond_2
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v3, v1

    .line 44
    check-cast v3, Lcom/zykj/view/board/board/x;

    .line 45
    .line 46
    sget-object v4, Lcom/zykj/view/board/board/y$b;->f:Lcom/zykj/view/board/board/y$b;

    .line 47
    .line 48
    const/4 v7, 0x6

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v2, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-static {v0, v2, v3, v1, v3}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->b(Lcom/zykj/blackboard/core/edit/IBoardControl;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lb7/j1;

    .line 69
    .line 70
    invoke-direct {v1, p0}, Lb7/j1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    invoke-static {v0, v2, v1, v4, v3}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->a(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ld5/k;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final N0(Lv4/b;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lv4/b;->U(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lm7/q;->h()Ljava/lang/Integer;

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
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/zykj/view/board/board/v;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->e()Lcom/zykj/view/board/board/u;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/zykj/view/board/board/u;->a()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    invoke-virtual {p1, v0}, Lv4/b;->V(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lm7/q;->i()Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1, v0}, Lv4/b;->Y(F)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p1}, Lv4/b;->f()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/high16 v1, 0x44160000    # 600.0f

    .line 54
    .line 55
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->d:Lt5/c;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lv4/b;->s0(Lt5/c;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final O0(FF)V
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
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->h:Landroid/graphics/PointF;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Lb7/i1;->f()Lcom/zykj/view/utils/ZoomPointSolution;

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
    sget-object v4, Lcom/zykj/view/board/board/BoardViewModel$a;->a:[I

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

.method public final P()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    invoke-interface {v0}, Ld5/k;->y()I

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
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Lb7/i1;->b()I

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

.method public final Q()Lb7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->b:Lb7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    invoke-interface {v0}, Ld5/k;->getBackgroundColor()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->u:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 13
    .line 14
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    move-object v3, v2

    .line 19
    check-cast v3, Lcom/zykj/view/board/board/a;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/view/board/board/j;->a()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_3

    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Lcom/zykj/view/board/board/b;

    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/zykj/view/board/board/b;->a()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-ne v6, v0, :cond_2

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-static {v3, v7, v5, v4, v6}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    :goto_0
    return-void

    .line 61
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 62
    .line 63
    const-string v1, "Collection contains no element matching the predicate."

    .line 64
    .line 65
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method

.method public final R()Lv4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lv4/b;

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

.method public final R0()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

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
    invoke-interface {v1}, Ld5/k;->n()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Ljava/util/List;

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
    check-cast v6, Lcom/zykj/view/board/board/z;

    .line 44
    .line 45
    invoke-virtual {v6}, Lcom/zykj/view/board/board/z;->a()F

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
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v5, Lcom/zykj/view/board/board/z$d;->c:Lcom/zykj/view/board/board/z$d;

    .line 65
    .line 66
    invoke-interface {v4, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    :cond_4
    iput v5, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    int-to-float v4, v4

    .line 74
    invoke-virtual {v2}, Lv4/b;->z()Lv4/d;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Lv4/d;->b()I

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
    invoke-virtual {v2}, Lv4/b;->z()Lv4/d;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Lv4/d;->c()I

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
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 99
    .line 100
    :cond_5
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object v6, v3

    .line 105
    check-cast v6, Lcom/zykj/view/board/board/o;

    .line 106
    .line 107
    invoke-interface {v1}, Ld5/k;->getMoveVerticalProgress()F

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    invoke-interface {v1}, Ld5/k;->getMoveHorizontalProgress()F

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    const/16 v16, 0x4f

    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v8, 0x0

    .line 121
    const/4 v9, 0x0

    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v13, 0x0

    .line 124
    invoke-static/range {v6 .. v17}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    :goto_2
    return-void
.end method

.method public final S()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lb7/i1;->e()Z

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
    invoke-static {}, Lcom/zykj/view/board/board/j;->f()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-static {}, Lcom/zykj/view/board/board/j;->e()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final S0(Lt5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->f:Lt5/a;

    .line 2
    .line 3
    return-void
.end method

.method public final T()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->r:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T0(Lv4/b;I)V
    .locals 10

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    or-int v1, p2, v0

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lv4/b;->m0(I)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :goto_0
    :try_start_1
    invoke-virtual {p1, p2}, Lv4/b;->a0(I)V

    .line 27
    .line 28
    .line 29
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    move-object p2, v0

    .line 37
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 38
    .line 39
    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :goto_1
    :try_start_2
    invoke-virtual {p1, v1}, Lv4/b;->h0(I)V

    .line 47
    .line 48
    .line 49
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catchall_2
    move-exception v0

    .line 56
    move-object p2, v0

    .line 57
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :goto_2
    const-string v6, "setShapeColor"

    .line 67
    .line 68
    const-string v7, "setStrokeColor"

    .line 69
    .line 70
    const-string v2, "setGeometryPaintColor"

    .line 71
    .line 72
    const-string v3, "setGeometryColor"

    .line 73
    .line 74
    const-string v4, "setGeometryStrokeColor"

    .line 75
    .line 76
    const-string v5, "setGraphColor"

    .line 77
    .line 78
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/String;

    .line 101
    .line 102
    :try_start_3
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const-string v3, "getMethods(...)"

    .line 113
    .line 114
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    array-length v3, v2

    .line 118
    const/4 v4, 0x0

    .line 119
    move v5, v4

    .line 120
    :goto_4
    const/4 v6, 0x0

    .line 121
    if-ge v5, v3, :cond_1

    .line 122
    .line 123
    aget-object v7, v2, v5

    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_0

    .line 134
    .line 135
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    array-length v8, v8

    .line 140
    const/4 v9, 0x1

    .line 141
    if-ne v8, v9, :cond_0

    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    aget-object v8, v8, v4

    .line 148
    .line 149
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 150
    .line 151
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_0

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :catchall_3
    move-exception v0

    .line 159
    goto :goto_6

    .line 160
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_1
    move-object v7, v6

    .line 164
    :goto_5
    if-eqz v7, :cond_2

    .line 165
    .line 166
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v7, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    :cond_2
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :goto_6
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_3
    return-void
.end method

.method public final U()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U0(Lt5/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->e:Lt5/b;

    .line 2
    .line 3
    return-void
.end method

.method public final V()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->B:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final V0(Lt5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->d:Lt5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final W()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->x:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W0(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ld5/k;->o()Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ld5/k;->B()Z

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final X()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/o;->f()Lcom/zykj/view/board/board/t;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/t$a;->f:Lcom/zykj/view/board/board/t$a;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final Y()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->D:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Y0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/o;->f()Lcom/zykj/view/board/board/t;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/t$b;->f:Lcom/zykj/view/board/board/t$b;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final Z()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->l:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Z0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/o;->f()Lcom/zykj/view/board/board/t;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/t$c;->f:Lcom/zykj/view/board/board/t$c;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final a0()Ld5/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->d()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ld5/k;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public final a1()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/v;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    xor-int/lit8 v9, v3, 0x1

    .line 15
    .line 16
    const/16 v10, 0x3f

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    invoke-static/range {v2 .. v11}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    return-void
.end method

.method public final b0()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->p:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b1()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/o;->f()Lcom/zykj/view/board/board/t;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/t$e;->f:Lcom/zykj/view/board/board/t$e;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 49
    .line 50
    :cond_2
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, Lcom/zykj/view/board/board/v;

    .line 56
    .line 57
    const/16 v10, 0x3f

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    invoke-static/range {v2 .. v11}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v1, v0, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    return-void
.end method

.method public final c0()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->z:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    invoke-interface {v0}, Ld5/k;->w()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ld5/k;->m()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->E:Z

    .line 19
    .line 20
    invoke-interface {v0}, Ld5/k;->stopRecord()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->E:Z

    .line 25
    .line 26
    invoke-interface {v0, v1}, Ld5/k;->s(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final d0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->D:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

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
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ld5/k;->l()Ljava/util/List;

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
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method

.method public final d1()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/o;->f()Lcom/zykj/view/board/board/t;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/t$f;->f:Lcom/zykj/view/board/board/t$f;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final e0(ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 9

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    move-object v3, p0

    .line 19
    move v4, p1

    .line 20
    move v5, p2

    .line 21
    move-object v7, p3

    .line 22
    move-object v6, p4

    .line 23
    invoke-direct/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v4, v2

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final e1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/r;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/view/board/board/r;->c()Lcom/zykj/view/board/board/s;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/zykj/view/board/board/s$b;->e:Lcom/zykj/view/board/board/s$b;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 20
    .line 21
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/zykj/view/board/board/p;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/zykj/view/board/board/p;->e()Lcom/zykj/view/board/board/q;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lcom/zykj/view/board/board/q$a;->e:Lcom/zykj/view/board/board/q$a;

    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->C()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public final f1(I)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/j;->a()Ljava/util/List;

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
    check-cast p1, Lcom/zykj/view/board/board/b;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->u:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/zykj/view/board/board/a;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v2, v5, p1, v3, v4}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Lv4/b;->Z(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lv4/b;->j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->b()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->e(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->d()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->g(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->c()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->f(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    :goto_0
    return-void

    .line 79
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-interface {v1}, Ld5/k;->getBackgroundColor()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v2, v3, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {v0}, Lv4/b;->j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v1, v2, v0}, Ld5/k;->g(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1}, Lm7/q;->l(Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final g0()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->n:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/k;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->f:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/view/board/board/k;->b()Lcom/zykj/view/board/board/l;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/zykj/view/board/board/l;->b()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {v1, v0}, Lv4/b;->e0(F)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h1()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/v;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->h()Lcom/zykj/view/board/board/w;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/zykj/view/board/board/w;->a()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->h()Lcom/zykj/view/board/board/w;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lcom/zykj/view/board/board/w;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v5, 0x6

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static/range {v1 .. v6}, Lv4/b;->d0(Lv4/b;ZFFILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->h()Lcom/zykj/view/board/board/w;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lcom/zykj/view/board/board/w;->d()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->g()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1, v2}, Lv4/b;->n0(F)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lv4/b;->b0(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->e()Lcom/zykj/view/board/board/u;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->a()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->h()Lcom/zykj/view/board/board/w;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Lcom/zykj/view/board/board/w;->c()F

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {v2, v3}, Lm7/c;->h(IF)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1, v2}, Lv4/b;->m0(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2}, Lv4/b;->a0(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lm7/q;->h()Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-nez v3, :cond_0

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/zykj/view/board/board/v;->e()Lcom/zykj/view/board/board/u;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lcom/zykj/view/board/board/u;->a()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {v1, v0}, Lv4/b;->V(I)V

    .line 110
    .line 111
    .line 112
    :cond_0
    invoke-static {}, Lm7/q;->c()Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-nez v0, :cond_1

    .line 117
    .line 118
    invoke-virtual {p0, v1, v2}, Lcom/zykj/view/board/board/BoardViewModel;->T0(Lv4/b;I)V

    .line 119
    .line 120
    .line 121
    :cond_1
    return-void
.end method

.method public final i0(Ld5/k;)V
    .locals 3

    .line 1
    new-instance v0, Lb7/m1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/m1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lb7/n1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lb7/n1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lb7/o1;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lb7/o1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v1, v2}, Lb7/e2;->d(Ld5/k;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final i1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lb7/f2;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lb7/f2;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->a:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, Lb7/f2;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->b:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v0}, Lb7/f2;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->c:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {v0}, Lb7/f2;->f()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->d:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0}, Lb7/f2;->b()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    sget-object v0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->e:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lv4/b;->r0(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-static {v1}, Lm7/q;->r(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final j1(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/j;->b()Ljava/util/List;

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
    check-cast p1, Lcom/zykj/view/board/board/l;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/zykj/view/board/board/k;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lcom/zykj/view/board/board/k;->a(Lcom/zykj/view/board/board/l;)Lcom/zykj/view/board/board/k;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->g1()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/view/board/board/l;->b()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lm7/q;->m(Ljava/lang/Float;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final k1(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final l1(Lcom/zykj/view/board/board/q;)V
    .locals 10

    .line 1
    const-string v0, "graphType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/view/board/board/s$b;->e:Lcom/zykj/view/board/board/s$b;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/board/BoardViewModel;->o1(Lcom/zykj/view/board/board/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/zykj/view/board/board/p;

    .line 19
    .line 20
    const/16 v8, 0xf

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v7, p1

    .line 28
    invoke-static/range {v2 .. v9}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->l:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7}, Lcom/zykj/view/board/board/q;->a()Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Lv4/b;->g0(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->C()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    move-object p1, v7

    .line 61
    goto :goto_0
.end method

.method public final m0(Lv4/b;)V
    .locals 7

    .line 1
    invoke-static {}, Lm7/q;->a()Ljava/lang/Integer;

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
    invoke-static {}, Lcom/zykj/view/board/board/j;->a()Ljava/util/List;

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
    check-cast v4, Lcom/zykj/view/board/board/b;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/zykj/view/board/board/b;->a()I

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
    invoke-static {}, Lcom/zykj/view/board/board/j;->a()Ljava/util/List;

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
    check-cast v0, Lcom/zykj/view/board/board/b;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->u:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 59
    .line 60
    :cond_4
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v4, v3

    .line 65
    check-cast v4, Lcom/zykj/view/board/board/a;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-static {v4, v1, v0, v6, v5}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->a()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1, v1}, Lv4/b;->Z(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lv4/b;->j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->b()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->e(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->d()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->g(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->c()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->f(F)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final m1(Z)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 9
    .line 10
    :goto_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    move-object v3, v2

    .line 15
    check-cast v3, Lcom/zykj/view/board/board/x;

    .line 16
    .line 17
    const/4 v7, 0x5

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move v5, p1

    .line 22
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v1, v2, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ld5/k;->c()V

    .line 35
    .line 36
    .line 37
    sget p1, Lcom/zykj/view/R$string;->turn_on_micro_phone:I

    .line 38
    .line 39
    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-interface {v0}, Ld5/k;->t()V

    .line 44
    .line 45
    .line 46
    sget p1, Lcom/zykj/view/R$string;->turn_off_micro_phone:I

    .line 47
    .line 48
    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    move p1, v5

    .line 53
    goto :goto_0
.end method

.method public final n0(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V
    .locals 18

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
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 22
    .line 23
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 24
    .line 25
    :cond_0
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    move-object v6, v5

    .line 30
    check-cast v6, Lcom/zykj/view/board/board/o;

    .line 31
    .line 32
    const/16 v16, 0x1fb

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    move/from16 v9, p2

    .line 45
    .line 46
    invoke-static/range {v6 .. v17}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v4, v5, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    cmp-long v4, v2, v4

    .line 59
    .line 60
    if-lez v4, :cond_2

    .line 61
    .line 62
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->y:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 63
    .line 64
    :cond_1
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    move-object v6, v5

    .line 69
    check-cast v6, Lcom/zykj/view/board/board/x;

    .line 70
    .line 71
    sget-object v7, Lcom/zykj/view/board/board/y$a;->f:Lcom/zykj/view/board/board/y$a;

    .line 72
    .line 73
    sget-object v8, Lm7/r;->a:Lm7/r;

    .line 74
    .line 75
    invoke-virtual {v8, v2, v3}, Lm7/r;->b(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    const/4 v10, 0x2

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    invoke-static/range {v6 .. v11}, Lcom/zykj/view/board/board/x;->b(Lcom/zykj/view/board/board/x;Lcom/zykj/view/board/board/y;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/x;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v4, v5, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const/4 v3, 0x1

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    const/high16 v4, 0x42400000    # 48.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Lv4/b;->q0(F)V

    .line 102
    .line 103
    .line 104
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    invoke-virtual {v4}, Lb7/i1;->b()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-virtual {v2, v4}, Lv4/b;->k0(I)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {}, Lm7/q;->j()Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    xor-int/2addr v4, v3

    .line 126
    invoke-virtual {v0, v4}, Lcom/zykj/view/board/board/BoardViewModel;->u1(Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->N0(Lv4/b;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->m0(Lv4/b;)V

    .line 133
    .line 134
    .line 135
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->e:Lt5/b;

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Lv4/b;->j0(Lt5/b;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->z0(Lv4/b;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->r0(Lv4/b;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->B0(Lv4/b;)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:Lt5/a;

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Lv4/b;->o0(Lt5/a;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->I0(Lv4/b;)V

    .line 155
    .line 156
    .line 157
    sget-object v2, Lcom/zykj/view/board/board/s$c;->e:Lcom/zykj/view/board/board/s$c;

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->o1(Lcom/zykj/view/board/board/s;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    new-instance v2, Lb7/s1;

    .line 163
    .line 164
    invoke-direct {v2, v0}, Lb7/s1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-eqz v4, :cond_5

    .line 172
    .line 173
    const-string v1, "pageControl is not Null"

    .line 174
    .line 175
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_5
    const-string v4, "pageControl is Null"

    .line 187
    .line 188
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    new-instance v4, Lb7/t1;

    .line 196
    .line 197
    invoke-direct {v4, v0, v2}, Lb7/t1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/jvm/functions/Function1;)V

    .line 198
    .line 199
    .line 200
    const/4 v2, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    invoke-static {v1, v5, v4, v3, v2}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->a(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ld5/k;

    .line 203
    .line 204
    .line 205
    :goto_0
    const-string v1, "initBoardControl Finished"

    .line 206
    .line 207
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final o1(Lcom/zykj/view/board/board/s;)V
    .locals 16

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
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v10, v0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v10}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    move-object v1, v11

    .line 17
    check-cast v1, Lcom/zykj/view/board/board/r;

    .line 18
    .line 19
    const/16 v8, 0x1f

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static/range {v1 .. v9}, Lcom/zykj/view/board/board/r;->b(Lcom/zykj/view/board/board/r;ZZZZZLcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/r;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v10, v11, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    sget-object v1, Lcom/zykj/view/board/board/s$b;->e:Lcom/zykj/view/board/board/s$b;

    .line 38
    .line 39
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 46
    .line 47
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v8, v2

    .line 52
    check-cast v8, Lcom/zykj/view/board/board/p;

    .line 53
    .line 54
    sget-object v13, Lcom/zykj/view/board/board/q$a;->e:Lcom/zykj/view/board/board/q$a;

    .line 55
    .line 56
    const/16 v14, 0xf

    .line 57
    .line 58
    const/4 v15, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    invoke-static/range {v8 .. v15}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    :cond_2
    sget-object v1, Lcom/zykj/view/board/board/s$d;->e:Lcom/zykj/view/board/board/s$d;

    .line 74
    .line 75
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->k:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    sget-object v1, Lcom/zykj/view/board/board/s$c;->e:Lcom/zykj/view/board/board/s$c;

    .line 94
    .line 95
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->h1()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_4
    sget-object v1, Lcom/zykj/view/board/board/s$a;->e:Lcom/zykj/view/board/board/s$a;

    .line 106
    .line 107
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->g1()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    sget-object v1, Lcom/zykj/view/board/board/s$b;->e:Lcom/zykj/view/board/board/s$b;

    .line 118
    .line 119
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    :cond_6
    return-void

    .line 126
    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 127
    .line 128
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 129
    .line 130
    .line 131
    throw v1
.end method

.method public final p1(I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/view/board/board/j;->c()Ljava/util/List;

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
    instance-of v2, v1, Lcom/zykj/view/board/board/u$b;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    new-instance v1, Lcom/zykj/view/board/board/u$b;

    .line 18
    .line 19
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 20
    .line 21
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/zykj/view/board/board/v;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/zykj/view/board/board/v;->f()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-direct {v1, v2}, Lcom/zykj/view/board/board/u$b;-><init>(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    :cond_1
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    move-object v4, v3

    .line 41
    check-cast v4, Lcom/zykj/view/board/board/v;

    .line 42
    .line 43
    move-object v9, v1

    .line 44
    check-cast v9, Lcom/zykj/view/board/board/u;

    .line 45
    .line 46
    const/16 v12, 0x6f

    .line 47
    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    invoke-static/range {v4 .. v13}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    instance-of v3, v1, Lcom/zykj/view/board/board/u$b;

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->a1()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 74
    .line 75
    :cond_3
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    move-object v10, v2

    .line 80
    check-cast v10, Lcom/zykj/view/board/board/v;

    .line 81
    .line 82
    const/16 v18, 0x3f

    .line 83
    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    invoke-static/range {v10 .. v19}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {v4, v2, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_3

    .line 104
    .line 105
    :goto_0
    if-eqz v3, :cond_5

    .line 106
    .line 107
    check-cast v1, Lcom/zykj/view/board/board/u;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/zykj/view/board/board/u;->a()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    return-void

    .line 117
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->h1()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->e1()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Lcom/zykj/view/board/board/u;->a()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v1}, Lm7/q;->o(Ljava/lang/Integer;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final q0(Lb7/a;)V
    .locals 1

    .line 1
    const-string v0, "boardCallbackConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->b:Lb7/a;

    .line 7
    .line 8
    return-void
.end method

.method public final q1(I)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/v;->e()Lcom/zykj/view/board/board/u;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    instance-of v3, v3, Lcom/zykj/view/board/board/u$b;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    new-instance v3, Lcom/zykj/view/board/board/u$b;

    .line 19
    .line 20
    invoke-direct {v3, p1}, Lcom/zykj/view/board/board/u$b;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_1
    move-object v7, v3

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    invoke-virtual {v2}, Lcom/zykj/view/board/board/v;->e()Lcom/zykj/view/board/board/u;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    goto :goto_1

    .line 30
    :goto_2
    const/16 v10, 0x4f

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    move v8, p1

    .line 39
    invoke-static/range {v2 .. v11}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->h1()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->e1()V

    .line 53
    .line 54
    .line 55
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lm7/q;->o(Ljava/lang/Integer;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    move p1, v8

    .line 64
    goto :goto_0
.end method

.method public final r0(Lv4/b;)V
    .locals 5

    .line 1
    invoke-static {}, Lm7/q;->b()Ljava/lang/Float;

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
    invoke-static {}, Lcom/zykj/view/board/board/j;->b()Ljava/util/List;

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
    check-cast v3, Lcom/zykj/view/board/board/l;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/zykj/view/board/board/l;->b()F

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
    invoke-static {}, Lcom/zykj/view/board/board/j;->b()Ljava/util/List;

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
    check-cast p1, Lcom/zykj/view/board/board/l;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->q:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 62
    .line 63
    :cond_4
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v2, v1

    .line 68
    check-cast v2, Lcom/zykj/view/board/board/k;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Lcom/zykj/view/board/board/k;->a(Lcom/zykj/view/board/board/l;)Lcom/zykj/view/board/board/k;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    return-void
.end method

.method public final r1(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final s0(Ld5/k;)V
    .locals 1

    .line 1
    new-instance v0, Lb7/p1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/p1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lb7/e2;->b(Ld5/k;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s1(Lcom/zykj/view/board/board/w;)V
    .locals 7

    .line 1
    const-string v0, "penType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/w;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final t1(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V
    .locals 11

    .line 1
    const-string v0, "selectGraphEnum"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lb7/f2;

    .line 13
    .line 14
    invoke-virtual {v0}, Lb7/f2;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Lb7/f2;->c()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Lb7/f2;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v0}, Lb7/f2;->f()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v0}, Lb7/f2;->b()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget-object v5, Lcom/zykj/view/board/board/BoardViewModel$a;->b:[I

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    aget p1, v5, p1

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    if-eq p1, v5, :cond_4

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-eq p1, v5, :cond_3

    .line 47
    .line 48
    const/4 v5, 0x3

    .line 49
    if-eq p1, v5, :cond_2

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    if-eq p1, v5, :cond_1

    .line 53
    .line 54
    const/4 v5, 0x5

    .line 55
    if-ne p1, v5, :cond_0

    .line 56
    .line 57
    xor-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    :goto_0
    move v10, v0

    .line 60
    move v6, v1

    .line 61
    move v7, v2

    .line 62
    move v8, v3

    .line 63
    move v9, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 66
    .line 67
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_1
    xor-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    xor-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    xor-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    xor-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :goto_1
    if-nez v6, :cond_5

    .line 84
    .line 85
    if-nez v7, :cond_5

    .line 86
    .line 87
    if-nez v8, :cond_5

    .line 88
    .line 89
    if-nez v9, :cond_5

    .line 90
    .line 91
    if-nez v10, :cond_5

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    new-array p1, p1, [Ljava/lang/Object;

    .line 95
    .line 96
    const-string v0, "\u6700\u5c11\u9700\u8981\u9009\u4e2d\u4e00\u4e2a\u7d20\u6750\u7c7b\u578b"

    .line 97
    .line 98
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 103
    .line 104
    :cond_6
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move-object v5, v0

    .line 109
    check-cast v5, Lb7/f2;

    .line 110
    .line 111
    invoke-virtual/range {v5 .. v10}, Lb7/f2;->a(ZZZZZ)Lb7/f2;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->i1()V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final u0(Ld5/k;)V
    .locals 1

    .line 1
    new-instance v0, Lb7/q1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/q1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lb7/e2;->c(Ld5/k;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final u1(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/r;

    .line 9
    .line 10
    const/16 v9, 0x2f

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    move v7, p1

    .line 19
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/r;->b(Lcom/zykj/view/board/board/r;ZZZZZLcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v7}, Lv4/b;->f0(Z)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lm7/q;->u(Ljava/lang/Boolean;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    move p1, v7

    .line 47
    goto :goto_0
.end method

.method public final w0(Ld5/k;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/board/BoardViewModel$b;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Ld5/k;->z(Ls5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final w1(Lcom/zykj/view/board/board/f;)V
    .locals 14

    .line 1
    const-string v0, "boardViewConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/zykj/view/board/board/r;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v9, 0x3c

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/r;->b(Lcom/zykj/view/board/board/r;ZZZZZLcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/r;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 41
    .line 42
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v2, v0

    .line 47
    check-cast v2, Lcom/zykj/view/board/board/v;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->d()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/16 v10, 0x7c

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    invoke-static/range {v2 .. v11}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;ZZLcom/zykj/view/board/board/w;ILcom/zykj/view/board/board/u;IZILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v1, v0, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 76
    .line 77
    :cond_2
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    move-object v2, v1

    .line 82
    check-cast v2, Lcom/zykj/view/board/board/p;

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->e()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->c()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->i()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->f()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const/16 v8, 0x10

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-static/range {v2 .. v9}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->u:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 115
    .line 116
    :cond_3
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v2, v0

    .line 121
    check-cast v2, Lcom/zykj/view/board/board/a;

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->b()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const/4 v4, 0x2

    .line 128
    const/4 v5, 0x0

    .line 129
    invoke-static {v2, v3, v5, v4, v5}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-interface {v1, v0, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 140
    .line 141
    :cond_4
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    move-object v2, v1

    .line 146
    check-cast v2, Lcom/zykj/view/board/board/o;

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/zykj/view/board/board/f;->a()Lcom/zykj/view/board/board/i;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    const/16 v12, 0x1fd

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v11, 0x0

    .line 163
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_4

    .line 172
    .line 173
    return-void
.end method

.method public final x0(Ld5/k;)V
    .locals 1

    .line 1
    new-instance v0, Lb7/l1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb7/l1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lb7/e2;->e(Ld5/k;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final x1(Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Ljava/util/List;

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
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 20
    .line 21
    add-int/2addr v3, v2

    .line 22
    iput v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 28
    .line 29
    if-lez v3, :cond_1

    .line 30
    .line 31
    add-int/lit8 v3, v3, -0x1

    .line 32
    .line 33
    iput v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 36
    .line 37
    if-ne v1, v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:I

    .line 46
    .line 47
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lcom/zykj/view/board/board/z;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/zykj/view/board/board/z;->a()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->a0()Ld5/k;

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
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->h:Landroid/graphics/PointF;

    .line 66
    .line 67
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    invoke-interface {v3, v5, v4, v1}, Ld5/k;->r(FFF)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v3}, Ld5/k;->getMoveVerticalProgress()F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-interface {v3}, Ld5/k;->getMoveHorizontalProgress()F

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
    invoke-interface {v3}, Ld5/k;->areaMoveStart()V

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
    invoke-interface {v3, v4, v5}, Ld5/k;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 138
    .line 139
    .line 140
    :goto_3
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lv4/b;

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
    invoke-virtual {v3}, Lv4/b;->z()Lv4/d;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Lv4/d;->b()I

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
    invoke-virtual {v3}, Lv4/b;->z()Lv4/d;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3}, Lv4/d;->c()I

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
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 173
    .line 174
    :cond_b
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    move-object v5, v2

    .line 179
    check-cast v5, Lcom/zykj/view/board/board/o;

    .line 180
    .line 181
    const/16 v15, 0xdf

    .line 182
    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const/4 v9, 0x0

    .line 189
    const/4 v10, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    invoke-static/range {v5 .. v16}, Lcom/zykj/view/board/board/o;->b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_b

    .line 201
    .line 202
    :goto_4
    return-void
.end method

.method public final y(Ljava/util/List;Z)V
    .locals 7

    .line 1
    const-string v0, "pathList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZLkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final z(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 9

    .line 1
    const-string v0, "scaleTypeEnum"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filename"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v2, p1

    .line 12
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object v1, p0

    .line 20
    move-object v5, p2

    .line 21
    move-object v4, p3

    .line 22
    move v7, p4

    .line 23
    move-object v3, p5

    .line 24
    move-object v6, p6

    .line 25
    invoke-direct/range {v0 .. v8}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    move-object p4, v0

    .line 29
    const/4 p5, 0x3

    .line 30
    const/4 p6, 0x0

    .line 31
    const/4 p2, 0x0

    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final z0(Lv4/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lb7/i1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lb7/i1;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lv4/b;->z()Lv4/d;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lv4/d;->l(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p1}, Lv4/b;->z()Lv4/d;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p1, v1}, Lv4/d;->l(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lv4/d;->o(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lv4/d;->i(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lv4/d;->k(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lb7/i1;->a()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Lv4/d;->j(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
