.class public final Lcom/canhub/cropper/CropImageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/canhub/cropper/CropOverlayView$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropImageView$a;,
        Lcom/canhub/cropper/CropImageView$CropCornerShape;,
        Lcom/canhub/cropper/CropImageView$b;,
        Lcom/canhub/cropper/CropImageView$CropShape;,
        Lcom/canhub/cropper/CropImageView$Guidelines;,
        Lcom/canhub/cropper/CropImageView$c;,
        Lcom/canhub/cropper/CropImageView$d;,
        Lcom/canhub/cropper/CropImageView$e;,
        Lcom/canhub/cropper/CropImageView$f;,
        Lcom/canhub/cropper/CropImageView$g;,
        Lcom/canhub/cropper/CropImageView$RequestSizeOptions;,
        Lcom/canhub/cropper/CropImageView$ScaleType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0014\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0018\u0000 \u00a5\u00022\u00020\u00012\u00020\u0002:\u0012\u00a6\u0002\u00a7\u0002\u00a8\u0002\u00a9\u0002\u00aa\u0002\u0081\u0001=WX\u0014\u001fuB\u001d\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J;\u0010\u0012\u001a\u00020\u00112\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u0016\u00a2\u0006\u0004\u0008(\u0010&J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016\u00a2\u0006\u0004\u0008*\u0010&J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0016\u00a2\u0006\u0004\u0008,\u0010&J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008/\u00100J\u0015\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b\u00a2\u0006\u0004\u00082\u00103J/\u00107\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u00104\u001a\u00020\u000b2\u0008\u0008\u0002\u00105\u001a\u00020\u000b2\u0008\u0008\u0002\u0010.\u001a\u000206H\u0007\u00a2\u0006\u0004\u00087\u00108JK\u0010=\u001a\u00020\u00112\u0008\u0008\u0002\u0010:\u001a\u0002092\u0008\u0008\u0002\u0010;\u001a\u00020\u000b2\u0008\u0008\u0002\u00104\u001a\u00020\u000b2\u0008\u0008\u0002\u00105\u001a\u00020\u000b2\u0008\u0008\u0002\u0010.\u001a\u0002062\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008=\u0010>J\u0017\u0010A\u001a\u00020\u00112\u0008\u0010@\u001a\u0004\u0018\u00010?\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0008\u0010@\u001a\u0004\u0018\u00010C\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010G\u001a\u00020\u00112\u0008\u0010@\u001a\u0004\u0018\u00010F\u00a2\u0006\u0004\u0008G\u0010HJ\u0017\u0010J\u001a\u00020\u00112\u0008\u0010@\u001a\u0004\u0018\u00010I\u00a2\u0006\u0004\u0008J\u0010KJ\u0017\u0010M\u001a\u00020\u00112\u0008\u0010@\u001a\u0004\u0018\u00010L\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010O\u001a\u00020\u00112\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008O\u0010PJ\u0017\u0010R\u001a\u00020\u00112\u0008\u0010Q\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008R\u0010SJ\u0015\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u000b\u00a2\u0006\u0004\u0008U\u0010VJ\r\u0010W\u001a\u00020\u0011\u00a2\u0006\u0004\u0008W\u0010\u0015J\r\u0010X\u001a\u00020\u0011\u00a2\u0006\u0004\u0008X\u0010\u0015J\u0017\u0010[\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020YH\u0000\u00a2\u0006\u0004\u0008[\u0010\\J\u0017\u0010^\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020]H\u0000\u00a2\u0006\u0004\u0008^\u0010_J?\u0010`\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010.\u001a\u0002062\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\u0008\u0010<\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010f\u001a\u00020\u00112\u0006\u0010e\u001a\u00020bH\u0016\u00a2\u0006\u0004\u0008f\u0010gJ\u001f\u0010j\u001a\u00020\u00112\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008j\u0010kJ7\u0010n\u001a\u00020\u00112\u0006\u0010l\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008n\u0010oJ/\u0010s\u001a\u00020\u00112\u0006\u0010p\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008s\u0010tJ\u0017\u0010u\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008u\u0010&R\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010wR\u0016\u0010{\u001a\u0004\u0018\u00010y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010zR\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010}R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010}R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008W\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008X\u0010\u0085\u0001R\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u00087\u0010\u0089\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0019\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008!\u0010\u008e\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008^\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008[\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008U\u0010\u008e\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0012\u0010\u008e\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\"\u0010\u008e\u0001R\u0019\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008#\u0010\u0098\u0001R.\u0010\u009a\u0001\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001d\n\u0005\u0008`\u0010\u0091\u0001\u0012\u0005\u0008\u009d\u0001\u0010\u0015\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001\"\u0005\u0008\u009c\u0001\u0010&R\u0018\u0010\u009e\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008%\u0010\u0091\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008m\u0010\u0091\u0001R\u001a\u0010\u00a3\u0001\u001a\u00030\u00a0\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R\u0019\u0010\u00a6\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0018\u0010\u00a7\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008p\u0010\u008e\u0001R\u0019\u0010\u00a9\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a8\u0001\u0010\u0091\u0001R\u0019\u0010\u00ab\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00aa\u0001\u0010\u0091\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ac\u0001\u0010\u008e\u0001R\u001b\u0010\u00b0\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R\u001b\u0010\u00b3\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R-\u0010\u000e\u001a\u0004\u0018\u00010\r2\t\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001\u001a\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001R\u0019\u0010\u00ba\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b9\u0001\u0010\u008e\u0001R\u0019\u0010\u00bc\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bb\u0001\u0010\u00a5\u0001R\u0019\u0010\u00bd\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a5\u0001\u0010\u00a5\u0001R\u0019\u0010\u00bf\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00be\u0001\u0010\u00a5\u0001R\u001c\u0010\u00c3\u0001\u001a\u0005\u0018\u00010\u00c0\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001R\u0019\u0010\u00c4\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008e\u0001R\u0019\u0010\u00c6\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c5\u0001\u0010\u0091\u0001R#\u0010\u00cb\u0001\u001a\u000c\u0012\u0005\u0012\u00030\u00c8\u0001\u0018\u00010\u00c7\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001R#\u0010\u00ce\u0001\u001a\u000c\u0012\u0005\u0012\u00030\u00cc\u0001\u0018\u00010\u00c7\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00cd\u0001\u0010\u00ca\u0001R)\u0010<\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00cf\u0001\u0010\u00b6\u0001\u001a\u0006\u0008\u00d0\u0001\u0010\u00b8\u0001\"\u0005\u0008\u00d1\u0001\u0010SR,\u0010\u00d2\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u00d2\u0001\u001a\u00030\u0097\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00d3\u0001\u0010\u00d4\u0001\"\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001R0\u0010\u00d8\u0001\u001a\u0005\u0018\u00010\u00d7\u00012\n\u0010\u00d8\u0001\u001a\u0005\u0018\u00010\u00d7\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00d9\u0001\u0010\u00da\u0001\"\u0006\u0008\u00db\u0001\u0010\u00dc\u0001R0\u0010\u00de\u0001\u001a\u0005\u0018\u00010\u00dd\u00012\n\u0010\u00de\u0001\u001a\u0005\u0018\u00010\u00dd\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00df\u0001\u0010\u00e0\u0001\"\u0006\u0008\u00e1\u0001\u0010\u00e2\u0001R)\u0010\u00e4\u0001\u001a\u00020\u00162\u0007\u0010\u00e3\u0001\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00e4\u0001\u0010\u009b\u0001\"\u0005\u0008\u00e5\u0001\u0010&R)\u0010\u00e6\u0001\u001a\u00020\u000b2\u0007\u0010\u00e6\u0001\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001\"\u0005\u0008\u00e9\u0001\u0010VR(\u0010\u00ec\u0001\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00ea\u0001\u0010\u00e8\u0001\"\u0005\u0008\u00eb\u0001\u0010VR)\u0010\u00ee\u0001\u001a\u00020\u00162\u0007\u0010\u00ed\u0001\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00ee\u0001\u0010\u009b\u0001\"\u0005\u0008\u00ef\u0001\u0010&R)\u0010\u00f1\u0001\u001a\u00020\u00162\u0007\u0010\u00f0\u0001\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00f1\u0001\u0010\u009b\u0001\"\u0005\u0008\u00f2\u0001\u0010&R0\u0010\u00f4\u0001\u001a\u0005\u0018\u00010\u00f3\u00012\n\u0010\u00f4\u0001\u001a\u0005\u0018\u00010\u00f3\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00f5\u0001\u0010\u00f6\u0001\"\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001R!\u0010\u00fc\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00f9\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00fa\u0001\u0010\u00fb\u0001R)\u0010\u00fe\u0001\u001a\u00020\u00162\u0007\u0010\u00fd\u0001\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00fe\u0001\u0010\u009b\u0001\"\u0005\u0008\u00ff\u0001\u0010&R)\u0010\u0081\u0002\u001a\u00020\u00162\u0007\u0010\u0080\u0002\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u0081\u0002\u0010\u009b\u0001\"\u0005\u0008\u0082\u0002\u0010&R)\u0010\u0084\u0002\u001a\u00020\u00162\u0007\u0010\u0083\u0002\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u0084\u0002\u0010\u009b\u0001\"\u0005\u0008\u0085\u0002\u0010&R,\u0010\u0086\u0002\u001a\u00030\u00a0\u00012\u0008\u0010\u0086\u0002\u001a\u00030\u00a0\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0087\u0002\u0010\u0088\u0002\"\u0006\u0008\u0089\u0002\u0010\u008a\u0002R)\u0010\u008f\u0002\u001a\u00020\u001b2\u0007\u0010\u008b\u0002\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u008c\u0002\u0010\u008d\u0002\"\u0005\u0008\u008e\u0002\u00103R)\u0010\u0090\u0002\u001a\u00020\u000b2\u0007\u0010\u0090\u0002\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u0091\u0002\u0010\u00e8\u0001\"\u0005\u0008\u0092\u0002\u0010VR(\u0010\u000c\u001a\u00020\u000b2\u0007\u0010\u0093\u0002\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u0094\u0002\u0010\u00e8\u0001\"\u0005\u0008\u0095\u0002\u0010VR\u0017\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0096\u00028F\u00a2\u0006\u0008\u001a\u0006\u0008\u0097\u0002\u0010\u0098\u0002R0\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u0096\u00022\n\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0096\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u009b\u0002\u0010\u0098\u0002\"\u0006\u0008\u009c\u0002\u0010\u009d\u0002R\u0017\u0010\u00a1\u0002\u001a\u0005\u0018\u00010\u00c0\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u009f\u0002\u0010\u00a0\u0002R\u0015\u0010\u00a4\u0002\u001a\u00030\u0084\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00a2\u0002\u0010\u00a3\u0002\u00a8\u0006\u00ab\u0002"
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/canhub/cropper/CropOverlayView$b;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "imageResource",
        "Landroid/net/Uri;",
        "imageUri",
        "loadSampleSize",
        "degreesRotated",
        "",
        "o",
        "(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V",
        "c",
        "()V",
        "",
        "inProgress",
        "animate",
        "j",
        "(ZZ)V",
        "",
        "width",
        "height",
        "center",
        "b",
        "(FFZZ)V",
        "k",
        "p",
        "q",
        "clear",
        "s",
        "(Z)V",
        "multiTouchEnabled",
        "setMultiTouchEnabled",
        "centerMoveEnabled",
        "setCenterMoveEnabled",
        "fixAspectRatio",
        "setFixedAspectRatio",
        "Lcom/canhub/cropper/CropImageOptions;",
        "options",
        "setImageCropOptions",
        "(Lcom/canhub/cropper/CropImageOptions;)V",
        "snapRadius",
        "setSnapRadius",
        "(F)V",
        "reqWidth",
        "reqHeight",
        "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;",
        "h",
        "(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "saveCompressFormat",
        "saveCompressQuality",
        "customOutputUri",
        "d",
        "(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V",
        "Lcom/canhub/cropper/CropImageView$e;",
        "listener",
        "setOnSetCropOverlayReleasedListener",
        "(Lcom/canhub/cropper/CropImageView$e;)V",
        "Lcom/canhub/cropper/CropImageView$d;",
        "setOnSetCropOverlayMovedListener",
        "(Lcom/canhub/cropper/CropImageView$d;)V",
        "Lcom/canhub/cropper/CropImageView$f;",
        "setOnCropWindowChangedListener",
        "(Lcom/canhub/cropper/CropImageView$f;)V",
        "Lcom/canhub/cropper/CropImageView$g;",
        "setOnSetImageUriCompleteListener",
        "(Lcom/canhub/cropper/CropImageView$g;)V",
        "Lcom/canhub/cropper/CropImageView$c;",
        "setOnCropImageCompleteListener",
        "(Lcom/canhub/cropper/CropImageView$c;)V",
        "setImageBitmap",
        "(Landroid/graphics/Bitmap;)V",
        "uri",
        "setImageUriAsync",
        "(Landroid/net/Uri;)V",
        "degrees",
        "n",
        "(I)V",
        "f",
        "g",
        "Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;",
        "result",
        "m",
        "(Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;)V",
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;",
        "l",
        "(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;)V",
        "r",
        "(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "state",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "changed",
        "t",
        "onLayout",
        "(ZIIII)V",
        "w",
        "oldw",
        "oldh",
        "onSizeChanged",
        "(IIII)V",
        "a",
        "Landroid/widget/ImageView;",
        "Landroid/widget/ImageView;",
        "imageView",
        "Lcom/canhub/cropper/CropOverlayView;",
        "Lcom/canhub/cropper/CropOverlayView;",
        "mCropOverlayView",
        "Landroid/graphics/Matrix;",
        "Landroid/graphics/Matrix;",
        "mImageMatrix",
        "mImageInverseMatrix",
        "Landroid/widget/ProgressBar;",
        "e",
        "Landroid/widget/ProgressBar;",
        "mProgressBar",
        "",
        "[F",
        "mImagePoints",
        "mScaleImagePoints",
        "Lk1/g;",
        "Lk1/g;",
        "mAnimation",
        "i",
        "Landroid/graphics/Bitmap;",
        "originalBitmap",
        "I",
        "mInitialDegreesRotated",
        "mDegreesRotated",
        "Z",
        "mFlipHorizontally",
        "mFlipVertically",
        "mLayoutWidth",
        "mLayoutHeight",
        "mImageResource",
        "Lcom/canhub/cropper/CropImageView$ScaleType;",
        "Lcom/canhub/cropper/CropImageView$ScaleType;",
        "mScaleType",
        "isSaveBitmapToInstanceState",
        "()Z",
        "setSaveBitmapToInstanceState",
        "isSaveBitmapToInstanceState$annotations",
        "mShowCropOverlay",
        "mShowCropLabel",
        "",
        "u",
        "Ljava/lang/String;",
        "mCropTextLabel",
        "v",
        "F",
        "mCropLabelTextSize",
        "mCropLabelTextColor",
        "x",
        "mShowProgressBar",
        "y",
        "mAutoZoomEnabled",
        "z",
        "mMaxZoom",
        "A",
        "Lcom/canhub/cropper/CropImageView$g;",
        "mOnSetImageUriCompleteListener",
        "B",
        "Lcom/canhub/cropper/CropImageView$c;",
        "mOnCropImageCompleteListener",
        "value",
        "C",
        "Landroid/net/Uri;",
        "getImageUri",
        "()Landroid/net/Uri;",
        "D",
        "loadedSampleSize",
        "E",
        "mZoom",
        "mZoomOffsetX",
        "G",
        "mZoomOffsetY",
        "Landroid/graphics/RectF;",
        "H",
        "Landroid/graphics/RectF;",
        "mRestoreCropWindowRect",
        "mRestoreDegreesRotated",
        "J",
        "mSizeChanged",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/canhub/cropper/BitmapLoadingWorkerJob;",
        "K",
        "Ljava/lang/ref/WeakReference;",
        "bitmapLoadingWorkerJob",
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob;",
        "L",
        "bitmapCroppingWorkerJob",
        "M",
        "getCustomOutputUri",
        "setCustomOutputUri",
        "scaleType",
        "getScaleType",
        "()Lcom/canhub/cropper/CropImageView$ScaleType;",
        "setScaleType",
        "(Lcom/canhub/cropper/CropImageView$ScaleType;)V",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "cropShape",
        "getCropShape",
        "()Lcom/canhub/cropper/CropImageView$CropShape;",
        "setCropShape",
        "(Lcom/canhub/cropper/CropImageView$CropShape;)V",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "cornerShape",
        "getCornerShape",
        "()Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "setCornerShape",
        "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V",
        "autoZoomEnabled",
        "isAutoZoomEnabled",
        "setAutoZoomEnabled",
        "maxZoom",
        "getMaxZoom",
        "()I",
        "setMaxZoom",
        "getRotatedDegrees",
        "setRotatedDegrees",
        "rotatedDegrees",
        "flipHorizontally",
        "isFlippedHorizontally",
        "setFlippedHorizontally",
        "flipVertically",
        "isFlippedVertically",
        "setFlippedVertically",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "guidelines",
        "getGuidelines",
        "()Lcom/canhub/cropper/CropImageView$Guidelines;",
        "setGuidelines",
        "(Lcom/canhub/cropper/CropImageView$Guidelines;)V",
        "Landroid/util/Pair;",
        "getAspectRatio",
        "()Landroid/util/Pair;",
        "aspectRatio",
        "showProgressBar",
        "isShowProgressBar",
        "setShowProgressBar",
        "showCropOverlay",
        "isShowCropOverlay",
        "setShowCropOverlay",
        "showCropLabel",
        "isShowCropLabel",
        "setShowCropLabel",
        "cropLabelText",
        "getCropLabelText",
        "()Ljava/lang/String;",
        "setCropLabelText",
        "(Ljava/lang/String;)V",
        "textSize",
        "getCropLabelTextSize",
        "()F",
        "setCropLabelTextSize",
        "cropLabelTextSize",
        "cropLabelTextColor",
        "getCropLabelTextColor",
        "setCropLabelTextColor",
        "resId",
        "getImageResource",
        "setImageResource",
        "Landroid/graphics/Rect;",
        "getWholeImageRect",
        "()Landroid/graphics/Rect;",
        "wholeImageRect",
        "rect",
        "getCropRect",
        "setCropRect",
        "(Landroid/graphics/Rect;)V",
        "cropRect",
        "getCropWindowRect",
        "()Landroid/graphics/RectF;",
        "cropWindowRect",
        "getCropPoints",
        "()[F",
        "cropPoints",
        "N",
        "CropShape",
        "CropCornerShape",
        "ScaleType",
        "Guidelines",
        "RequestSizeOptions",
        "cropper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"
    }
.end annotation


# static fields
.field public static final N:Lcom/canhub/cropper/CropImageView$a;


# instance fields
.field public A:Lcom/canhub/cropper/CropImageView$g;

.field public B:Lcom/canhub/cropper/CropImageView$c;

.field public C:Landroid/net/Uri;

.field public D:I

.field public E:F

.field public F:F

.field public G:F

.field public H:Landroid/graphics/RectF;

.field public I:I

.field public J:Z

.field public K:Ljava/lang/ref/WeakReference;

.field public L:Ljava/lang/ref/WeakReference;

.field public M:Landroid/net/Uri;

.field public final a:Landroid/widget/ImageView;

.field public final b:Lcom/canhub/cropper/CropOverlayView;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/Matrix;

.field public final e:Landroid/widget/ProgressBar;

.field public final f:[F

.field public final g:[F

.field public h:Lk1/g;

.field public i:Landroid/graphics/Bitmap;

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Lcom/canhub/cropper/CropImageView$ScaleType;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Ljava/lang/String;

.field public v:F

.field public w:I

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/canhub/cropper/CropImageView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/canhub/cropper/CropImageView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/canhub/cropper/CropImageView;->N:Lcom/canhub/cropper/CropImageView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 83
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "context"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct/range {p0 .. p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 21
    .line 22
    new-instance v3, Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 28
    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    new-array v4, v3, [F

    .line 32
    .line 33
    iput-object v4, v1, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 34
    .line 35
    new-array v3, v3, [F

    .line 36
    .line 37
    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->g:[F

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 41
    .line 42
    const-string v4, ""

    .line 43
    .line 44
    iput-object v4, v1, Lcom/canhub/cropper/CropImageView;->u:Ljava/lang/String;

    .line 45
    .line 46
    const/high16 v4, 0x41a00000    # 20.0f

    .line 47
    .line 48
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->v:F

    .line 49
    .line 50
    const/4 v4, -0x1

    .line 51
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->w:I

    .line 52
    .line 53
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 54
    .line 55
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 56
    .line 57
    iput v3, v1, Lcom/canhub/cropper/CropImageView;->D:I

    .line 58
    .line 59
    const/high16 v4, 0x3f800000    # 1.0f

    .line 60
    .line 61
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->E:F

    .line 62
    .line 63
    instance-of v4, v0, Landroid/app/Activity;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    if-eqz v4, :cond_0

    .line 67
    .line 68
    move-object v4, v0

    .line 69
    check-cast v4, Landroid/app/Activity;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move-object v4, v5

    .line 73
    :goto_0
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    const-string v6, "CROP_IMAGE_EXTRA_BUNDLE"

    .line 82
    .line 83
    invoke-virtual {v4, v6}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    const-string v6, "CROP_IMAGE_EXTRA_OPTIONS"

    .line 90
    .line 91
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    instance-of v6, v4, Lcom/canhub/cropper/CropImageOptions;

    .line 96
    .line 97
    if-nez v6, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-object v5, v4

    .line 101
    :goto_1
    check-cast v5, Lcom/canhub/cropper/CropImageOptions;

    .line 102
    .line 103
    if-nez v5, :cond_6

    .line 104
    .line 105
    :cond_2
    if-eqz v2, :cond_5

    .line 106
    .line 107
    sget-object v4, Lcom/canhub/cropper/R$styleable;->CropImageView:[I

    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-virtual {v0, v2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v4, "obtainStyledAttributes(...)"

    .line 115
    .line 116
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v6, Lcom/canhub/cropper/CropImageOptions;

    .line 120
    .line 121
    const/16 v79, 0x3f

    .line 122
    .line 123
    const/16 v80, 0x0

    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/16 v23, 0x0

    .line 149
    .line 150
    const/16 v24, 0x0

    .line 151
    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const/16 v26, 0x0

    .line 155
    .line 156
    const/16 v27, 0x0

    .line 157
    .line 158
    const/16 v28, 0x0

    .line 159
    .line 160
    const/16 v29, 0x0

    .line 161
    .line 162
    const/16 v30, 0x0

    .line 163
    .line 164
    const/16 v31, 0x0

    .line 165
    .line 166
    const/16 v32, 0x0

    .line 167
    .line 168
    const/16 v33, 0x0

    .line 169
    .line 170
    const/16 v34, 0x0

    .line 171
    .line 172
    const/16 v35, 0x0

    .line 173
    .line 174
    const/16 v36, 0x0

    .line 175
    .line 176
    const/16 v37, 0x0

    .line 177
    .line 178
    const/16 v38, 0x0

    .line 179
    .line 180
    const/16 v39, 0x0

    .line 181
    .line 182
    const/16 v40, 0x0

    .line 183
    .line 184
    const/16 v41, 0x0

    .line 185
    .line 186
    const/16 v42, 0x0

    .line 187
    .line 188
    const/16 v43, 0x0

    .line 189
    .line 190
    const/16 v44, 0x0

    .line 191
    .line 192
    const/16 v45, 0x0

    .line 193
    .line 194
    const/16 v46, 0x0

    .line 195
    .line 196
    const/16 v47, 0x0

    .line 197
    .line 198
    const/16 v48, 0x0

    .line 199
    .line 200
    const/16 v49, 0x0

    .line 201
    .line 202
    const/16 v50, 0x0

    .line 203
    .line 204
    const/16 v51, 0x0

    .line 205
    .line 206
    const/16 v52, 0x0

    .line 207
    .line 208
    const/16 v53, 0x0

    .line 209
    .line 210
    const/16 v54, 0x0

    .line 211
    .line 212
    const/16 v55, 0x0

    .line 213
    .line 214
    const/16 v56, 0x0

    .line 215
    .line 216
    const/16 v57, 0x0

    .line 217
    .line 218
    const/16 v58, 0x0

    .line 219
    .line 220
    const/16 v59, 0x0

    .line 221
    .line 222
    const/16 v60, 0x0

    .line 223
    .line 224
    const/16 v61, 0x0

    .line 225
    .line 226
    const/16 v62, 0x0

    .line 227
    .line 228
    const/16 v63, 0x0

    .line 229
    .line 230
    const/16 v64, 0x0

    .line 231
    .line 232
    const/16 v65, 0x0

    .line 233
    .line 234
    const/16 v66, 0x0

    .line 235
    .line 236
    const/16 v67, 0x0

    .line 237
    .line 238
    const/16 v68, 0x0

    .line 239
    .line 240
    const/16 v69, 0x0

    .line 241
    .line 242
    const/16 v70, 0x0

    .line 243
    .line 244
    const/16 v71, 0x0

    .line 245
    .line 246
    const/16 v72, 0x0

    .line 247
    .line 248
    const/16 v73, 0x0

    .line 249
    .line 250
    const/16 v74, 0x0

    .line 251
    .line 252
    const/16 v75, 0x0

    .line 253
    .line 254
    const/16 v76, 0x0

    .line 255
    .line 256
    const/16 v77, -0x1

    .line 257
    .line 258
    const/16 v78, -0x1

    .line 259
    .line 260
    invoke-direct/range {v6 .. v80}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 261
    .line 262
    .line 263
    :try_start_0
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropSaveBitmapToInstanceState:I

    .line 264
    .line 265
    iget-boolean v7, v1, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 266
    .line 267
    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    iput-boolean v4, v1, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 272
    .line 273
    invoke-static {}, Lcom/canhub/cropper/CropImageView$ScaleType;->values()[Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropScaleType:I

    .line 278
    .line 279
    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 280
    .line 281
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    aget-object v17, v4, v7

    .line 290
    .line 291
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropShape;->values()[Lcom/canhub/cropper/CropImageView$CropShape;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShape:I

    .line 296
    .line 297
    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    aget-object v11, v4, v7

    .line 308
    .line 309
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropCornerShape;->values()[Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cornerShape:I

    .line 314
    .line 315
    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 316
    .line 317
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    aget-object v12, v4, v7

    .line 326
    .line 327
    invoke-static {}, Lcom/canhub/cropper/CropImageView$Guidelines;->values()[Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelines:I

    .line 332
    .line 333
    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 334
    .line 335
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    aget-object v16, v4, v7

    .line 344
    .line 345
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    .line 346
    .line 347
    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 348
    .line 349
    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 350
    .line 351
    .line 352
    move-result v29

    .line 353
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioY:I

    .line 354
    .line 355
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 356
    .line 357
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 358
    .line 359
    .line 360
    move-result v30

    .line 361
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAutoZoomEnabled:I

    .line 362
    .line 363
    iget-boolean v8, v6, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 364
    .line 365
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 366
    .line 367
    .line 368
    move-result v22

    .line 369
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMultiTouchEnabled:I

    .line 370
    .line 371
    iget-boolean v8, v6, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 372
    .line 373
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 374
    .line 375
    .line 376
    move-result v23

    .line 377
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCenterMoveEnabled:I

    .line 378
    .line 379
    iget-boolean v8, v6, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 380
    .line 381
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 382
    .line 383
    .line 384
    move-result v24

    .line 385
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCornerRadius:I

    .line 386
    .line 387
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->e:F

    .line 388
    .line 389
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 390
    .line 391
    .line 392
    move-result v13

    .line 393
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropSnapRadius:I

    .line 394
    .line 395
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 396
    .line 397
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 398
    .line 399
    .line 400
    move-result v14

    .line 401
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropTouchRadius:I

    .line 402
    .line 403
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 404
    .line 405
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 406
    .line 407
    .line 408
    move-result v15

    .line 409
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropInitialCropWindowPaddingRatio:I

    .line 410
    .line 411
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 412
    .line 413
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 414
    .line 415
    .line 416
    move-result v27

    .line 417
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCornerCircleFillColor:I

    .line 418
    .line 419
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->C:I

    .line 420
    .line 421
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 422
    .line 423
    .line 424
    move-result v37

    .line 425
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderLineThickness:I

    .line 426
    .line 427
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->w:F

    .line 428
    .line 429
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 430
    .line 431
    .line 432
    move-result v31

    .line 433
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderLineColor:I

    .line 434
    .line 435
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 436
    .line 437
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 438
    .line 439
    .line 440
    move-result v32

    .line 441
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerThickness:I

    .line 442
    .line 443
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 444
    .line 445
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 446
    .line 447
    .line 448
    move-result v33

    .line 449
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerOffset:I

    .line 450
    .line 451
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->z:F

    .line 452
    .line 453
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 454
    .line 455
    .line 456
    move-result v34

    .line 457
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerLength:I

    .line 458
    .line 459
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->A:F

    .line 460
    .line 461
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 462
    .line 463
    .line 464
    move-result v35

    .line 465
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerColor:I

    .line 466
    .line 467
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 468
    .line 469
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 470
    .line 471
    .line 472
    move-result v36

    .line 473
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelinesThickness:I

    .line 474
    .line 475
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->D:F

    .line 476
    .line 477
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 478
    .line 479
    .line 480
    move-result v38

    .line 481
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelinesColor:I

    .line 482
    .line 483
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->E:I

    .line 484
    .line 485
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 486
    .line 487
    .line 488
    move-result v39

    .line 489
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBackgroundColor:I

    .line 490
    .line 491
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->F:I

    .line 492
    .line 493
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 494
    .line 495
    .line 496
    move-result v40

    .line 497
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropWindowWidth:I

    .line 498
    .line 499
    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->G:I

    .line 500
    .line 501
    int-to-float v8, v8

    .line 502
    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    float-to-int v7, v7

    .line 507
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropWindowHeight:I

    .line 508
    .line 509
    iget v9, v6, Lcom/canhub/cropper/CropImageOptions;->H:I

    .line 510
    .line 511
    int-to-float v9, v9

    .line 512
    invoke-virtual {v2, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    float-to-int v8, v8

    .line 517
    sget v9, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropResultWidthPX:I

    .line 518
    .line 519
    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->I:I

    .line 520
    .line 521
    int-to-float v10, v10

    .line 522
    invoke-virtual {v2, v9, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 523
    .line 524
    .line 525
    move-result v9

    .line 526
    float-to-int v9, v9

    .line 527
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropResultHeightPX:I

    .line 528
    .line 529
    iget v5, v6, Lcom/canhub/cropper/CropImageOptions;->J:I

    .line 530
    .line 531
    int-to-float v5, v5

    .line 532
    invoke-virtual {v2, v10, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    float-to-int v5, v5

    .line 537
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxCropResultWidthPX:I

    .line 538
    .line 539
    iget v3, v6, Lcom/canhub/cropper/CropImageOptions;->K:I

    .line 540
    .line 541
    int-to-float v3, v3

    .line 542
    invoke-virtual {v2, v10, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    float-to-int v3, v3

    .line 547
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxCropResultHeightPX:I

    .line 548
    .line 549
    iget v0, v6, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 550
    .line 551
    int-to-float v0, v0

    .line 552
    invoke-virtual {v2, v10, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    float-to-int v0, v0

    .line 557
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFlipHorizontally:I

    .line 558
    .line 559
    move/from16 v46, v0

    .line 560
    .line 561
    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 562
    .line 563
    invoke-virtual {v2, v10, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 564
    .line 565
    .line 566
    move-result v63

    .line 567
    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 568
    .line 569
    invoke-virtual {v2, v10, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 570
    .line 571
    .line 572
    move-result v64

    .line 573
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelTextSize:I

    .line 574
    .line 575
    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 576
    .line 577
    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 578
    .line 579
    .line 580
    move-result v71

    .line 581
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelTextColor:I

    .line 582
    .line 583
    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->n0:I

    .line 584
    .line 585
    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 586
    .line 587
    .line 588
    move-result v72

    .line 589
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowLabel:I

    .line 590
    .line 591
    iget-boolean v10, v6, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 592
    .line 593
    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 594
    .line 595
    .line 596
    move-result v19

    .line 597
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxZoom:I

    .line 598
    .line 599
    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 600
    .line 601
    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 602
    .line 603
    .line 604
    move-result v26

    .line 605
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowCropOverlay:I

    .line 606
    .line 607
    iget-boolean v10, v6, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 608
    .line 609
    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowProgressBar:I

    .line 614
    .line 615
    move/from16 p2, v0

    .line 616
    .line 617
    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 618
    .line 619
    invoke-virtual {v2, v10, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 620
    .line 621
    .line 622
    move-result v20

    .line 623
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelText:I

    .line 624
    .line 625
    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v73

    .line 629
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFixAspectRatio:I

    .line 630
    .line 631
    iget-boolean v6, v6, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 632
    .line 633
    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    if-nez v0, :cond_4

    .line 638
    .line 639
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-eqz v0, :cond_3

    .line 644
    .line 645
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    if-eqz v0, :cond_3

    .line 650
    .line 651
    goto :goto_3

    .line 652
    :catchall_0
    move-exception v0

    .line 653
    goto :goto_5

    .line 654
    :cond_3
    const/16 v28, 0x0

    .line 655
    .line 656
    :goto_2
    move/from16 v42, v8

    .line 657
    .line 658
    goto :goto_4

    .line 659
    :cond_4
    :goto_3
    const/16 v28, 0x1

    .line 660
    .line 661
    goto :goto_2

    .line 662
    :goto_4
    new-instance v8, Lcom/canhub/cropper/CropImageOptions;

    .line 663
    .line 664
    const/16 v81, 0x3e

    .line 665
    .line 666
    const/16 v82, 0x0

    .line 667
    .line 668
    move/from16 v43, v9

    .line 669
    .line 670
    const/4 v9, 0x0

    .line 671
    const/4 v10, 0x0

    .line 672
    const/16 v21, 0x0

    .line 673
    .line 674
    const/16 v25, 0x0

    .line 675
    .line 676
    const/16 v47, 0x0

    .line 677
    .line 678
    const/16 v48, 0x0

    .line 679
    .line 680
    const/16 v49, 0x0

    .line 681
    .line 682
    const/16 v50, 0x0

    .line 683
    .line 684
    const/16 v51, 0x0

    .line 685
    .line 686
    const/16 v52, 0x0

    .line 687
    .line 688
    const/16 v53, 0x0

    .line 689
    .line 690
    const/16 v54, 0x0

    .line 691
    .line 692
    const/16 v55, 0x0

    .line 693
    .line 694
    const/16 v56, 0x0

    .line 695
    .line 696
    const/16 v57, 0x0

    .line 697
    .line 698
    const/16 v58, 0x0

    .line 699
    .line 700
    const/16 v59, 0x0

    .line 701
    .line 702
    const/16 v60, 0x0

    .line 703
    .line 704
    const/16 v61, 0x0

    .line 705
    .line 706
    const/16 v62, 0x0

    .line 707
    .line 708
    const/16 v65, 0x0

    .line 709
    .line 710
    const/16 v66, 0x0

    .line 711
    .line 712
    const/16 v67, 0x0

    .line 713
    .line 714
    const/16 v68, 0x0

    .line 715
    .line 716
    const/16 v69, 0x0

    .line 717
    .line 718
    const/16 v70, 0x0

    .line 719
    .line 720
    const/16 v74, 0x0

    .line 721
    .line 722
    const/16 v75, 0x0

    .line 723
    .line 724
    const/16 v76, 0x0

    .line 725
    .line 726
    const/16 v77, 0x0

    .line 727
    .line 728
    const/16 v78, 0x0

    .line 729
    .line 730
    const v79, 0x11003

    .line 731
    .line 732
    .line 733
    const v80, 0x3f3fffc0    # 0.7499962f

    .line 734
    .line 735
    .line 736
    move/from16 v18, p2

    .line 737
    .line 738
    move/from16 v45, v3

    .line 739
    .line 740
    move/from16 v44, v5

    .line 741
    .line 742
    move/from16 v41, v7

    .line 743
    .line 744
    invoke-direct/range {v8 .. v82}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 745
    .line 746
    .line 747
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 748
    .line 749
    .line 750
    move-object v5, v8

    .line 751
    goto/16 :goto_6

    .line 752
    .line 753
    :goto_5
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 754
    .line 755
    .line 756
    throw v0

    .line 757
    :cond_5
    new-instance v3, Lcom/canhub/cropper/CropImageOptions;

    .line 758
    .line 759
    const/16 v76, 0x3f

    .line 760
    .line 761
    const/16 v77, 0x0

    .line 762
    .line 763
    const/4 v4, 0x0

    .line 764
    const/4 v5, 0x0

    .line 765
    const/4 v6, 0x0

    .line 766
    const/4 v7, 0x0

    .line 767
    const/4 v8, 0x0

    .line 768
    const/4 v9, 0x0

    .line 769
    const/4 v10, 0x0

    .line 770
    const/4 v11, 0x0

    .line 771
    const/4 v12, 0x0

    .line 772
    const/4 v13, 0x0

    .line 773
    const/4 v14, 0x0

    .line 774
    const/4 v15, 0x0

    .line 775
    const/16 v16, 0x0

    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    const/16 v18, 0x0

    .line 780
    .line 781
    const/16 v19, 0x0

    .line 782
    .line 783
    const/16 v20, 0x0

    .line 784
    .line 785
    const/16 v21, 0x0

    .line 786
    .line 787
    const/16 v22, 0x0

    .line 788
    .line 789
    const/16 v23, 0x0

    .line 790
    .line 791
    const/16 v24, 0x0

    .line 792
    .line 793
    const/16 v25, 0x0

    .line 794
    .line 795
    const/16 v26, 0x0

    .line 796
    .line 797
    const/16 v27, 0x0

    .line 798
    .line 799
    const/16 v28, 0x0

    .line 800
    .line 801
    const/16 v29, 0x0

    .line 802
    .line 803
    const/16 v30, 0x0

    .line 804
    .line 805
    const/16 v31, 0x0

    .line 806
    .line 807
    const/16 v32, 0x0

    .line 808
    .line 809
    const/16 v33, 0x0

    .line 810
    .line 811
    const/16 v34, 0x0

    .line 812
    .line 813
    const/16 v35, 0x0

    .line 814
    .line 815
    const/16 v36, 0x0

    .line 816
    .line 817
    const/16 v37, 0x0

    .line 818
    .line 819
    const/16 v38, 0x0

    .line 820
    .line 821
    const/16 v39, 0x0

    .line 822
    .line 823
    const/16 v40, 0x0

    .line 824
    .line 825
    const/16 v41, 0x0

    .line 826
    .line 827
    const/16 v42, 0x0

    .line 828
    .line 829
    const/16 v43, 0x0

    .line 830
    .line 831
    const/16 v44, 0x0

    .line 832
    .line 833
    const/16 v45, 0x0

    .line 834
    .line 835
    const/16 v46, 0x0

    .line 836
    .line 837
    const/16 v47, 0x0

    .line 838
    .line 839
    const/16 v48, 0x0

    .line 840
    .line 841
    const/16 v49, 0x0

    .line 842
    .line 843
    const/16 v50, 0x0

    .line 844
    .line 845
    const/16 v51, 0x0

    .line 846
    .line 847
    const/16 v52, 0x0

    .line 848
    .line 849
    const/16 v53, 0x0

    .line 850
    .line 851
    const/16 v54, 0x0

    .line 852
    .line 853
    const/16 v55, 0x0

    .line 854
    .line 855
    const/16 v56, 0x0

    .line 856
    .line 857
    const/16 v57, 0x0

    .line 858
    .line 859
    const/16 v58, 0x0

    .line 860
    .line 861
    const/16 v59, 0x0

    .line 862
    .line 863
    const/16 v60, 0x0

    .line 864
    .line 865
    const/16 v61, 0x0

    .line 866
    .line 867
    const/16 v62, 0x0

    .line 868
    .line 869
    const/16 v63, 0x0

    .line 870
    .line 871
    const/16 v64, 0x0

    .line 872
    .line 873
    const/16 v65, 0x0

    .line 874
    .line 875
    const/16 v66, 0x0

    .line 876
    .line 877
    const/16 v67, 0x0

    .line 878
    .line 879
    const/16 v68, 0x0

    .line 880
    .line 881
    const/16 v69, 0x0

    .line 882
    .line 883
    const/16 v70, 0x0

    .line 884
    .line 885
    const/16 v71, 0x0

    .line 886
    .line 887
    const/16 v72, 0x0

    .line 888
    .line 889
    const/16 v73, 0x0

    .line 890
    .line 891
    const/16 v74, -0x1

    .line 892
    .line 893
    const/16 v75, -0x1

    .line 894
    .line 895
    invoke-direct/range {v3 .. v77}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 896
    .line 897
    .line 898
    move-object v5, v3

    .line 899
    :cond_6
    :goto_6
    iget-object v0, v5, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 900
    .line 901
    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 902
    .line 903
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 904
    .line 905
    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 906
    .line 907
    iget v0, v5, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 908
    .line 909
    iput v0, v1, Lcom/canhub/cropper/CropImageView;->z:I

    .line 910
    .line 911
    iget v0, v5, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 912
    .line 913
    iput v0, v1, Lcom/canhub/cropper/CropImageView;->v:F

    .line 914
    .line 915
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 916
    .line 917
    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 918
    .line 919
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 920
    .line 921
    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 922
    .line 923
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 924
    .line 925
    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 926
    .line 927
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 928
    .line 929
    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 930
    .line 931
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 932
    .line 933
    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 934
    .line 935
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    sget v2, Lcom/canhub/cropper/R$layout;->crop_image_view:I

    .line 940
    .line 941
    const/4 v3, 0x1

    .line 942
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    sget v2, Lcom/canhub/cropper/R$id;->ImageView_image:I

    .line 947
    .line 948
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    check-cast v2, Landroid/widget/ImageView;

    .line 953
    .line 954
    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 955
    .line 956
    sget-object v3, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 957
    .line 958
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 959
    .line 960
    .line 961
    sget v2, Lcom/canhub/cropper/R$id;->CropOverlayView:I

    .line 962
    .line 963
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    check-cast v2, Lcom/canhub/cropper/CropOverlayView;

    .line 968
    .line 969
    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 970
    .line 971
    invoke-virtual {v2, v1}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowChangeListener(Lcom/canhub/cropper/CropOverlayView$b;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v2, v5}, Lcom/canhub/cropper/CropOverlayView;->setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V

    .line 975
    .line 976
    .line 977
    sget v2, Lcom/canhub/cropper/R$id;->CropProgressBar:I

    .line 978
    .line 979
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    check-cast v0, Landroid/widget/ProgressBar;

    .line 984
    .line 985
    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->e:Landroid/widget/ProgressBar;

    .line 986
    .line 987
    iget v2, v5, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 988
    .line 989
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 990
    .line 991
    .line 992
    move-result-object v2

    .line 993
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageView;->q()V

    .line 997
    .line 998
    .line 999
    return-void
.end method

.method public static synthetic e(Lcom/canhub/cropper/CropImageView;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    const/16 p2, 0x5a

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p8, :cond_2

    .line 17
    .line 18
    move p3, v0

    .line 19
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 20
    .line 21
    if-eqz p8, :cond_3

    .line 22
    .line 23
    move p4, v0

    .line 24
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 25
    .line 26
    if-eqz p8, :cond_4

    .line 27
    .line 28
    sget-object p5, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->c:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 29
    .line 30
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 31
    .line 32
    if-eqz p7, :cond_5

    .line 33
    .line 34
    const/4 p6, 0x0

    .line 35
    :cond_5
    move-object p7, p5

    .line 36
    move-object p8, p6

    .line 37
    move p5, p3

    .line 38
    move p6, p4

    .line 39
    move-object p3, p1

    .line 40
    move p4, p2

    .line 41
    move-object p2, p0

    .line 42
    invoke-virtual/range {p2 .. p8}, Lcom/canhub/cropper/CropImageView;->d(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static synthetic i(Lcom/canhub/cropper/CropImageView;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    sget-object p3, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->c:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 17
    .line 18
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/canhub/cropper/CropImageView;->h(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final b(FFZZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v2, p1, v1

    .line 7
    .line 8
    if-lez v2, :cond_c

    .line 9
    .line 10
    cmpl-float v2, p2, v1

    .line 11
    .line 12
    if-lez v2, :cond_c

    .line 13
    .line 14
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    int-to-float v4, v4

    .line 47
    sub-float v4, p1, v4

    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    int-to-float v5, v5

    .line 51
    div-float/2addr v4, v5

    .line 52
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-float v0, v0

    .line 57
    sub-float v0, p2, v0

    .line 58
    .line 59
    div-float/2addr v0, v5

    .line 60
    invoke-virtual {v3, v4, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->k()V

    .line 64
    .line 65
    .line 66
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 67
    .line 68
    if-lez v0, :cond_0

    .line 69
    .line 70
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 71
    .line 72
    int-to-float v0, v0

    .line 73
    sget-object v4, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 74
    .line 75
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 76
    .line 77
    invoke-virtual {v4, v6}, Lcom/canhub/cropper/a;->w([F)F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 82
    .line 83
    invoke-virtual {v4, v7}, Lcom/canhub/cropper/a;->x([F)F

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-virtual {v3, v0, v6, v4}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->k()V

    .line 91
    .line 92
    .line 93
    :cond_0
    sget-object v0, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 94
    .line 95
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Lcom/canhub/cropper/a;->D([F)F

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    div-float v3, p1, v3

    .line 102
    .line 103
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 104
    .line 105
    invoke-virtual {v0, v4}, Lcom/canhub/cropper/a;->z([F)F

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    div-float v4, p2, v4

    .line 110
    .line 111
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 116
    .line 117
    sget-object v6, Lcom/canhub/cropper/CropImageView$ScaleType;->a:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 118
    .line 119
    if-eq v4, v6, :cond_3

    .line 120
    .line 121
    sget-object v6, Lcom/canhub/cropper/CropImageView$ScaleType;->d:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 122
    .line 123
    const/high16 v7, 0x3f800000    # 1.0f

    .line 124
    .line 125
    if-ne v4, v6, :cond_1

    .line 126
    .line 127
    cmpg-float v6, v3, v7

    .line 128
    .line 129
    if-ltz v6, :cond_3

    .line 130
    .line 131
    :cond_1
    cmpl-float v6, v3, v7

    .line 132
    .line 133
    if-lez v6, :cond_2

    .line 134
    .line 135
    iget-boolean v6, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 136
    .line 137
    if-eqz v6, :cond_2

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    sget-object v3, Lcom/canhub/cropper/CropImageView$ScaleType;->c:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 141
    .line 142
    if-ne v4, v3, :cond_4

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    int-to-float v3, v3

    .line 149
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 150
    .line 151
    invoke-virtual {v0, v4}, Lcom/canhub/cropper/a;->D([F)F

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    div-float/2addr v3, v4

    .line 156
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    int-to-float v4, v4

    .line 161
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 162
    .line 163
    invoke-virtual {v0, v6}, Lcom/canhub/cropper/a;->z([F)F

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    div-float/2addr v4, v6

    .line 168
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    iput v3, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    :goto_0
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 176
    .line 177
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 178
    .line 179
    invoke-virtual {v0, v6}, Lcom/canhub/cropper/a;->w([F)F

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 184
    .line 185
    invoke-virtual {v0, v7}, Lcom/canhub/cropper/a;->x([F)F

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual {v4, v3, v3, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->k()V

    .line 193
    .line 194
    .line 195
    :cond_4
    :goto_1
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 196
    .line 197
    if-eqz v3, :cond_5

    .line 198
    .line 199
    iget v3, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 200
    .line 201
    neg-float v3, v3

    .line 202
    goto :goto_2

    .line 203
    :cond_5
    iget v3, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 204
    .line 205
    :goto_2
    iget-boolean v4, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 206
    .line 207
    if-eqz v4, :cond_6

    .line 208
    .line 209
    iget v4, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 210
    .line 211
    neg-float v4, v4

    .line 212
    goto :goto_3

    .line 213
    :cond_6
    iget v4, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 214
    .line 215
    :goto_3
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 216
    .line 217
    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 218
    .line 219
    invoke-virtual {v0, v7}, Lcom/canhub/cropper/a;->w([F)F

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    iget-object v8, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 224
    .line 225
    invoke-virtual {v0, v8}, Lcom/canhub/cropper/a;->x([F)F

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    invoke-virtual {v6, v3, v4, v7, v8}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->k()V

    .line 233
    .line 234
    .line 235
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 236
    .line 237
    invoke-virtual {v6, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 238
    .line 239
    .line 240
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 241
    .line 242
    sget-object v7, Lcom/canhub/cropper/CropImageView$ScaleType;->c:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 243
    .line 244
    if-ne v6, v7, :cond_7

    .line 245
    .line 246
    if-eqz p3, :cond_7

    .line 247
    .line 248
    if-nez p4, :cond_7

    .line 249
    .line 250
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 251
    .line 252
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 253
    .line 254
    goto/16 :goto_6

    .line 255
    .line 256
    :cond_7
    if-eqz p3, :cond_a

    .line 257
    .line 258
    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 259
    .line 260
    invoke-virtual {v0, p3}, Lcom/canhub/cropper/a;->D([F)F

    .line 261
    .line 262
    .line 263
    move-result p3

    .line 264
    cmpl-float p3, p1, p3

    .line 265
    .line 266
    if-lez p3, :cond_8

    .line 267
    .line 268
    move p1, v1

    .line 269
    goto :goto_4

    .line 270
    :cond_8
    div-float/2addr p1, v5

    .line 271
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    .line 272
    .line 273
    .line 274
    move-result p3

    .line 275
    sub-float/2addr p1, p3

    .line 276
    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 277
    .line 278
    invoke-virtual {v0, p3}, Lcom/canhub/cropper/a;->A([F)F

    .line 279
    .line 280
    .line 281
    move-result p3

    .line 282
    neg-float p3, p3

    .line 283
    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 288
    .line 289
    .line 290
    move-result p3

    .line 291
    int-to-float p3, p3

    .line 292
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 293
    .line 294
    invoke-virtual {v0, v6}, Lcom/canhub/cropper/a;->B([F)F

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    sub-float/2addr p3, v6

    .line 299
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    div-float/2addr p1, v3

    .line 304
    :goto_4
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 305
    .line 306
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 307
    .line 308
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/a;->z([F)F

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    cmpl-float p1, p2, p1

    .line 313
    .line 314
    if-lez p1, :cond_9

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_9
    div-float/2addr p2, v5

    .line 318
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    sub-float/2addr p2, p1

    .line 323
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 324
    .line 325
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/a;->C([F)F

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    neg-float p1, p1

    .line 330
    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    int-to-float p2, p2

    .line 339
    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 340
    .line 341
    invoke-virtual {v0, p3}, Lcom/canhub/cropper/a;->v([F)F

    .line 342
    .line 343
    .line 344
    move-result p3

    .line 345
    sub-float/2addr p2, p3

    .line 346
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    div-float v1, p1, v4

    .line 351
    .line 352
    :goto_5
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_a
    iget p3, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 356
    .line 357
    mul-float/2addr p3, v3

    .line 358
    iget v0, v2, Landroid/graphics/RectF;->left:F

    .line 359
    .line 360
    neg-float v0, v0

    .line 361
    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    .line 362
    .line 363
    .line 364
    move-result p3

    .line 365
    iget v0, v2, Landroid/graphics/RectF;->right:F

    .line 366
    .line 367
    neg-float v0, v0

    .line 368
    add-float/2addr v0, p1

    .line 369
    invoke-static {p3, v0}, Ljava/lang/Math;->min(FF)F

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    div-float/2addr p1, v3

    .line 374
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 375
    .line 376
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 377
    .line 378
    mul-float/2addr p1, v4

    .line 379
    iget p3, v2, Landroid/graphics/RectF;->top:F

    .line 380
    .line 381
    neg-float p3, p3

    .line 382
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    iget p3, v2, Landroid/graphics/RectF;->bottom:F

    .line 387
    .line 388
    neg-float p3, p3

    .line 389
    add-float/2addr p3, p2

    .line 390
    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    .line 391
    .line 392
    .line 393
    move-result p1

    .line 394
    div-float/2addr p1, v4

    .line 395
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 396
    .line 397
    :goto_6
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 398
    .line 399
    iget p2, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 400
    .line 401
    mul-float/2addr p2, v3

    .line 402
    iget p3, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 403
    .line 404
    mul-float/2addr p3, v4

    .line 405
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 406
    .line 407
    .line 408
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 409
    .line 410
    mul-float/2addr p1, v3

    .line 411
    iget p2, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 412
    .line 413
    mul-float/2addr p2, v4

    .line 414
    invoke-virtual {v2, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 415
    .line 416
    .line 417
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 418
    .line 419
    invoke-virtual {p1, v2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->k()V

    .line 423
    .line 424
    .line 425
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 426
    .line 427
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 428
    .line 429
    .line 430
    if-eqz p4, :cond_b

    .line 431
    .line 432
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lk1/g;

    .line 433
    .line 434
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 438
    .line 439
    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 440
    .line 441
    invoke-virtual {p1, p2, p3}, Lk1/g;->b([FLandroid/graphics/Matrix;)V

    .line 442
    .line 443
    .line 444
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 445
    .line 446
    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->h:Lk1/g;

    .line 447
    .line 448
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 449
    .line 450
    .line 451
    goto :goto_7

    .line 452
    :cond_b
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 453
    .line 454
    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 455
    .line 456
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 457
    .line 458
    .line 459
    :goto_7
    const/4 p1, 0x0

    .line 460
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageView;->s(Z)V

    .line 461
    .line 462
    .line 463
    :cond_c
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 24
    .line 25
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 29
    .line 30
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 31
    .line 32
    const/high16 v2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 38
    .line 39
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 40
    .line 41
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 47
    .line 48
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->I:I

    .line 49
    .line 50
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->p()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final d(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V
    .locals 8

    .line 1
    const-string v0, "saveCompressFormat"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->B:Lcom/canhub/cropper/CropImageView$c;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-object v5, p1

    .line 17
    move v6, p2

    .line 18
    move v2, p3

    .line 19
    move v3, p4

    .line 20
    move-object v4, p5

    .line 21
    move-object v7, p6

    .line 22
    invoke-virtual/range {v1 .. v7}, Lcom/canhub/cropper/CropImageView;->r(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string p2, "mOnCropImageCompleteListener is not set"

    .line 29
    .line 30
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-float v2, v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-float v2, v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final getAspectRatio()Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getCropLabelText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCropLabelTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCropLabelTextSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public final getCropPoints()[F
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 13
    .line 14
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 15
    .line 16
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 17
    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    new-array v5, v4, [F

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    aput v1, v5, v6

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    aput v2, v5, v7

    .line 27
    .line 28
    const/4 v7, 0x2

    .line 29
    aput v3, v5, v7

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    aput v2, v5, v7

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    aput v3, v5, v2

    .line 36
    .line 37
    const/4 v2, 0x5

    .line 38
    aput v0, v5, v2

    .line 39
    .line 40
    const/4 v2, 0x6

    .line 41
    aput v1, v5, v2

    .line 42
    .line 43
    const/4 v1, 0x7

    .line 44
    aput v0, v5, v1

    .line 45
    .line 46
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 56
    .line 57
    .line 58
    new-array v0, v4, [F

    .line 59
    .line 60
    :goto_0
    if-ge v6, v4, :cond_0

    .line 61
    .line 62
    aget v1, v5, v6

    .line 63
    .line 64
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 65
    .line 66
    int-to-float v2, v2

    .line 67
    mul-float/2addr v1, v2

    .line 68
    aput v1, v0, v6

    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    return-object v0
.end method

.method public final getCropRect()Landroid/graphics/Rect;
    .locals 8

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    mul-int/2addr v3, v0

    .line 18
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    mul-int v4, v1, v0

    .line 23
    .line 24
    sget-object v1, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->o()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual/range {v1 .. v7}, Lcom/canhub/cropper/a;->y([FIIZII)Landroid/graphics/Rect;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public final getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getCropWindowRect()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

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

.method public final getCroppedImage()Landroid/graphics/Bitmap;
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/canhub/cropper/CropImageView;->i(Lcom/canhub/cropper/CropImageView;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method public final getCustomOutputUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getImageResource()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final getImageUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxZoom()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRotatedDegrees()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final getScaleType()Lcom/canhub/cropper/CropImageView$ScaleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWholeImageRect()Landroid/graphics/Rect;
    .locals 4

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    mul-int/2addr v2, v0

    .line 14
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/2addr v1, v0

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final h(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "options"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    if-eqz v4, :cond_4

    .line 13
    .line 14
    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->a:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    move/from16 v15, p1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v15, v3

    .line 23
    :goto_0
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    move/from16 v16, p2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move/from16 v16, v3

    .line 29
    .line 30
    :goto_1
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget v2, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-gt v2, v3, :cond_3

    .line 38
    .line 39
    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->b:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 40
    .line 41
    if-ne v1, v2, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move/from16 v12, v16

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    :goto_2
    sget-object v5, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const-string v2, "getContext(...)"

    .line 54
    .line 55
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v7, v0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    iget v9, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 65
    .line 66
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget v3, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 76
    .line 77
    mul-int v10, v2, v3

    .line 78
    .line 79
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iget v3, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 89
    .line 90
    mul-int v11, v2, v3

    .line 91
    .line 92
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 93
    .line 94
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->o()Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 110
    .line 111
    .line 112
    move-result v14

    .line 113
    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 114
    .line 115
    iget-boolean v3, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 116
    .line 117
    move/from16 v17, v2

    .line 118
    .line 119
    move/from16 v18, v3

    .line 120
    .line 121
    invoke-virtual/range {v5 .. v18}, Lcom/canhub/cropper/a;->d(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/a$a;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move/from16 v12, v16

    .line 126
    .line 127
    invoke-virtual {v2}, Lcom/canhub/cropper/a$a;->a()Landroid/graphics/Bitmap;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    goto :goto_4

    .line 132
    :goto_3
    sget-object v3, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iget v6, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 139
    .line 140
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 141
    .line 142
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->o()Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    iget-boolean v10, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 162
    .line 163
    iget-boolean v11, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 164
    .line 165
    invoke-virtual/range {v3 .. v11}, Lcom/canhub/cropper/a;->g(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/a$a;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Lcom/canhub/cropper/a$a;->a()Landroid/graphics/Bitmap;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    :goto_4
    sget-object v3, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 174
    .line 175
    invoke-virtual {v3, v2, v15, v12, v1}, Lcom/canhub/cropper/a;->G(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    return-object v1

    .line 180
    :cond_4
    const/4 v1, 0x0

    .line 181
    return-object v1
.end method

.method public final j(ZZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v2, :cond_a

    .line 12
    .line 13
    if-lez v0, :cond_a

    .line 14
    .line 15
    if-lez v1, :cond_a

    .line 16
    .line 17
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget p1, v2, Landroid/graphics/RectF;->left:F

    .line 30
    .line 31
    cmpg-float p1, p1, v3

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    iget p1, v2, Landroid/graphics/RectF;->top:F

    .line 36
    .line 37
    cmpg-float p1, p1, v3

    .line 38
    .line 39
    if-ltz p1, :cond_0

    .line 40
    .line 41
    iget p1, v2, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    int-to-float p2, v0

    .line 44
    cmpl-float p1, p1, p2

    .line 45
    .line 46
    if-gtz p1, :cond_0

    .line 47
    .line 48
    iget p1, v2, Landroid/graphics/RectF;->bottom:F

    .line 49
    .line 50
    int-to-float p2, v1

    .line 51
    cmpl-float p1, p1, p2

    .line 52
    .line 53
    if-lez p1, :cond_a

    .line 54
    .line 55
    :cond_0
    int-to-float p1, v0

    .line 56
    int-to-float p2, v1

    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_1
    iget-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 64
    .line 65
    const/high16 v4, 0x3f800000    # 1.0f

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 70
    .line 71
    cmpl-float p1, p1, v4

    .line 72
    .line 73
    if-lez p1, :cond_a

    .line 74
    .line 75
    :cond_2
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 76
    .line 77
    iget v5, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 78
    .line 79
    int-to-float v5, v5

    .line 80
    cmpg-float p1, p1, v5

    .line 81
    .line 82
    if-gez p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    int-to-float v5, v0

    .line 89
    const/high16 v6, 0x3f000000    # 0.5f

    .line 90
    .line 91
    mul-float v7, v5, v6

    .line 92
    .line 93
    cmpg-float p1, p1, v7

    .line 94
    .line 95
    if-gez p1, :cond_3

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    int-to-float v7, v1

    .line 102
    mul-float/2addr v6, v7

    .line 103
    cmpg-float p1, p1, v6

    .line 104
    .line 105
    if-gez p1, :cond_3

    .line 106
    .line 107
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 108
    .line 109
    int-to-float p1, p1

    .line 110
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    iget v8, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 115
    .line 116
    div-float/2addr v6, v8

    .line 117
    const v8, 0x3f23d70a    # 0.64f

    .line 118
    .line 119
    .line 120
    div-float/2addr v6, v8

    .line 121
    div-float/2addr v5, v6

    .line 122
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    iget v9, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 127
    .line 128
    div-float/2addr v6, v9

    .line 129
    div-float/2addr v6, v8

    .line 130
    div-float/2addr v7, v6

    .line 131
    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    invoke-static {p1, v5}, Ljava/lang/Math;->min(FF)F

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    goto :goto_0

    .line 140
    :cond_3
    move p1, v3

    .line 141
    :goto_0
    iget v5, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 142
    .line 143
    cmpl-float v5, v5, v4

    .line 144
    .line 145
    if-lez v5, :cond_5

    .line 146
    .line 147
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    int-to-float v6, v0

    .line 152
    const v7, 0x3f266666    # 0.65f

    .line 153
    .line 154
    .line 155
    mul-float v8, v6, v7

    .line 156
    .line 157
    cmpl-float v5, v5, v8

    .line 158
    .line 159
    if-gtz v5, :cond_4

    .line 160
    .line 161
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    int-to-float v8, v1

    .line 166
    mul-float/2addr v8, v7

    .line 167
    cmpl-float v5, v5, v8

    .line 168
    .line 169
    if-lez v5, :cond_5

    .line 170
    .line 171
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    iget v5, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 176
    .line 177
    div-float/2addr p1, v5

    .line 178
    const v5, 0x3f028f5c    # 0.51f

    .line 179
    .line 180
    .line 181
    div-float/2addr p1, v5

    .line 182
    div-float/2addr v6, p1

    .line 183
    int-to-float p1, v1

    .line 184
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    iget v7, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 189
    .line 190
    div-float/2addr v2, v7

    .line 191
    div-float/2addr v2, v5

    .line 192
    div-float/2addr p1, v2

    .line 193
    invoke-static {v6, p1}, Ljava/lang/Math;->min(FF)F

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    :cond_5
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 202
    .line 203
    if-nez v2, :cond_6

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_6
    move v4, p1

    .line 207
    :goto_1
    cmpl-float p1, v4, v3

    .line 208
    .line 209
    if-lez p1, :cond_a

    .line 210
    .line 211
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 212
    .line 213
    cmpg-float p1, v4, p1

    .line 214
    .line 215
    if-nez p1, :cond_7

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_7
    if-eqz p2, :cond_9

    .line 219
    .line 220
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lk1/g;

    .line 221
    .line 222
    if-nez p1, :cond_8

    .line 223
    .line 224
    new-instance p1, Lk1/g;

    .line 225
    .line 226
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 227
    .line 228
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 229
    .line 230
    invoke-direct {p1, v2, v3}, Lk1/g;-><init>(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V

    .line 231
    .line 232
    .line 233
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lk1/g;

    .line 234
    .line 235
    :cond_8
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lk1/g;

    .line 236
    .line 237
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 241
    .line 242
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 243
    .line 244
    invoke-virtual {p1, v2, v3}, Lk1/g;->c([FLandroid/graphics/Matrix;)V

    .line 245
    .line 246
    .line 247
    :cond_9
    iput v4, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 248
    .line 249
    int-to-float p1, v0

    .line 250
    int-to-float v0, v1

    .line 251
    const/4 v1, 0x1

    .line 252
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 253
    .line 254
    .line 255
    :cond_a
    :goto_2
    return-void
.end method

.method public final k()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    aput v2, v0, v1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    aput v2, v0, v3

    .line 9
    .line 10
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    int-to-float v4, v4

    .line 20
    const/4 v5, 0x2

    .line 21
    aput v4, v0, v5

    .line 22
    .line 23
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 24
    .line 25
    const/4 v4, 0x3

    .line 26
    aput v2, v0, v4

    .line 27
    .line 28
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    int-to-float v6, v6

    .line 38
    const/4 v7, 0x4

    .line 39
    aput v6, v0, v7

    .line 40
    .line 41
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 42
    .line 43
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    int-to-float v6, v6

    .line 53
    const/4 v8, 0x5

    .line 54
    aput v6, v0, v8

    .line 55
    .line 56
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 57
    .line 58
    const/4 v6, 0x6

    .line 59
    aput v2, v0, v6

    .line 60
    .line 61
    iget-object v9, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    int-to-float v9, v9

    .line 71
    const/4 v10, 0x7

    .line 72
    aput v9, v0, v10

    .line 73
    .line 74
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 75
    .line 76
    iget-object v9, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 77
    .line 78
    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->g:[F

    .line 82
    .line 83
    aput v2, v0, v1

    .line 84
    .line 85
    aput v2, v0, v3

    .line 86
    .line 87
    const/high16 v1, 0x42c80000    # 100.0f

    .line 88
    .line 89
    aput v1, v0, v5

    .line 90
    .line 91
    aput v2, v0, v4

    .line 92
    .line 93
    aput v1, v0, v7

    .line 94
    .line 95
    aput v1, v0, v8

    .line 96
    .line 97
    aput v2, v0, v6

    .line 98
    .line 99
    aput v1, v0, v10

    .line 100
    .line 101
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final l(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;)V
    .locals 12

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->q()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->B:Lcom/canhub/cropper/CropImageView$c;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, Lcom/canhub/cropper/CropImageView$b;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;->a()Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;->d()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;->b()Ljava/lang/Exception;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWholeImageRect()Landroid/graphics/Rect;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getRotatedDegrees()I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;->c()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    invoke-direct/range {v1 .. v11}, Lcom/canhub/cropper/CropImageView$b;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p0, v1}, Lcom/canhub/cropper/CropImageView$c;->a(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$b;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method public final m(Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;)V
    .locals 7

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->q()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->c()Ljava/lang/Exception;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->b()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->j:I

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->a()Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->g()Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->f()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->b()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/4 v3, 0x0

    .line 53
    move-object v1, p0

    .line 54
    invoke-virtual/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->o(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move-object v1, p0

    .line 59
    :goto_0
    iget-object v0, v1, Lcom/canhub/cropper/CropImageView;->A:Lcom/canhub/cropper/CropImageView$g;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->g()Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$a;->c()Ljava/lang/Exception;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {v0, p0, v2, p1}, Lcom/canhub/cropper/CropImageView$g;->b(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method public final n(I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    rem-int/lit16 v1, v1, 0x168

    .line 12
    .line 13
    add-int/lit16 v1, v1, 0x168

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    rem-int/lit16 v1, v1, 0x168

    .line 17
    .line 18
    :goto_0
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->o()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/16 v2, 0x2e

    .line 32
    .line 33
    if-gt v2, v1, :cond_1

    .line 34
    .line 35
    const/16 v2, 0x87

    .line 36
    .line 37
    if-ge v1, v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/16 v2, 0xd8

    .line 41
    .line 42
    if-gt v2, v1, :cond_2

    .line 43
    .line 44
    const/16 v2, 0x131

    .line 45
    .line 46
    if-ge v1, v2, :cond_2

    .line 47
    .line 48
    :goto_1
    move v2, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v2, v4

    .line 51
    :goto_2
    sget-object v5, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v7, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 58
    .line 59
    invoke-virtual {v7}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v6, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    :goto_3
    const/high16 v7, 0x40000000    # 2.0f

    .line 82
    .line 83
    div-float/2addr v6, v7

    .line 84
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    goto :goto_4

    .line 95
    :cond_4
    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    :goto_4
    div-float/2addr v8, v7

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 103
    .line 104
    iget-boolean v7, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 105
    .line 106
    iput-boolean v7, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 107
    .line 108
    iput-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 109
    .line 110
    :cond_5
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 111
    .line 112
    iget-object v7, v0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 113
    .line 114
    invoke-virtual {v2, v7}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerX()F

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    aput v7, v2, v4

    .line 130
    .line 131
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    aput v7, v2, v3

    .line 144
    .line 145
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const/4 v7, 0x2

    .line 150
    const/4 v9, 0x0

    .line 151
    aput v9, v2, v7

    .line 152
    .line 153
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/4 v10, 0x3

    .line 158
    aput v9, v2, v10

    .line 159
    .line 160
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const/4 v11, 0x4

    .line 165
    const/high16 v12, 0x3f800000    # 1.0f

    .line 166
    .line 167
    aput v12, v2, v11

    .line 168
    .line 169
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/4 v13, 0x5

    .line 174
    aput v9, v2, v13

    .line 175
    .line 176
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 177
    .line 178
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v2, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 183
    .line 184
    .line 185
    iget v2, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 186
    .line 187
    add-int/2addr v2, v1

    .line 188
    rem-int/lit16 v2, v2, 0x168

    .line 189
    .line 190
    iput v2, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    int-to-float v1, v1

    .line 197
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    int-to-float v2, v2

    .line 202
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 206
    .line 207
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-virtual {v1, v2, v9}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 216
    .line 217
    .line 218
    iget v1, v0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 219
    .line 220
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    aget v2, v2, v11

    .line 225
    .line 226
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    aget v9, v9, v7

    .line 231
    .line 232
    sub-float/2addr v2, v9

    .line 233
    float-to-double v14, v2

    .line 234
    move v2, v7

    .line 235
    move/from16 p1, v8

    .line 236
    .line 237
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 238
    .line 239
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 240
    .line 241
    .line 242
    move-result-wide v14

    .line 243
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    aget v9, v9, v13

    .line 248
    .line 249
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 250
    .line 251
    .line 252
    move-result-object v16

    .line 253
    aget v16, v16, v10

    .line 254
    .line 255
    sub-float v9, v9, v16

    .line 256
    .line 257
    move/from16 v16, v10

    .line 258
    .line 259
    move/from16 v17, v11

    .line 260
    .line 261
    float-to-double v10, v9

    .line 262
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 263
    .line 264
    .line 265
    move-result-wide v9

    .line 266
    add-double/2addr v14, v9

    .line 267
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 268
    .line 269
    .line 270
    move-result-wide v9

    .line 271
    double-to-float v9, v9

    .line 272
    div-float/2addr v1, v9

    .line 273
    iput v1, v0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 274
    .line 275
    invoke-static {v1, v12}, Ljava/lang/Math;->max(FF)F

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iput v1, v0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 280
    .line 281
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    int-to-float v1, v1

    .line 286
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    int-to-float v9, v9

    .line 291
    invoke-virtual {v0, v1, v9, v3, v4}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 292
    .line 293
    .line 294
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 295
    .line 296
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->s()[F

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-virtual {v1, v9, v10}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    aget v1, v1, v17

    .line 312
    .line 313
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    aget v2, v9, v2

    .line 318
    .line 319
    sub-float/2addr v1, v2

    .line 320
    float-to-double v1, v1

    .line 321
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 322
    .line 323
    .line 324
    move-result-wide v1

    .line 325
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    aget v9, v9, v13

    .line 330
    .line 331
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    aget v10, v10, v16

    .line 336
    .line 337
    sub-float/2addr v9, v10

    .line 338
    float-to-double v9, v9

    .line 339
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 340
    .line 341
    .line 342
    move-result-wide v7

    .line 343
    add-double/2addr v1, v7

    .line 344
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 345
    .line 346
    .line 347
    move-result-wide v1

    .line 348
    double-to-float v1, v1

    .line 349
    mul-float/2addr v6, v1

    .line 350
    mul-float v8, p1, v1

    .line 351
    .line 352
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    aget v2, v2, v4

    .line 361
    .line 362
    sub-float/2addr v2, v6

    .line 363
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    aget v7, v7, v3

    .line 368
    .line 369
    sub-float/2addr v7, v8

    .line 370
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    aget v9, v9, v4

    .line 375
    .line 376
    add-float/2addr v9, v6

    .line 377
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->t()[F

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    aget v6, v6, v3

    .line 382
    .line 383
    add-float/2addr v6, v8

    .line 384
    invoke-virtual {v1, v2, v7, v9, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 385
    .line 386
    .line 387
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 388
    .line 389
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->t()V

    .line 390
    .line 391
    .line 392
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 393
    .line 394
    invoke-virtual {v5}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v1, v2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    int-to-float v1, v1

    .line 406
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    int-to-float v2, v2

    .line 411
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, v4, v4}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 415
    .line 416
    .line 417
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 418
    .line 419
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->m()V

    .line 420
    .line 421
    .line 422
    :cond_6
    return-void
.end method

.method public final o(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->c()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 22
    .line 23
    iput p2, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 24
    .line 25
    iput p4, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 26
    .line 27
    iput p5, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-float p1, p1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    int-to-float p2, p2

    .line 39
    const/4 p3, 0x1

    .line 40
    const/4 p4, 0x0

    .line 41
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->t()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->p()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 3

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->n:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-lez v0, :cond_6

    .line 9
    .line 10
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->o:I

    .line 11
    .line 12
    if-lez v0, :cond_6

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->n:I

    .line 19
    .line 20
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 21
    .line 22
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->o:I

    .line 23
    .line 24
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    sub-int/2addr p4, p2

    .line 34
    int-to-float p2, p4

    .line 35
    sub-int/2addr p5, p3

    .line 36
    int-to-float p3, p5

    .line 37
    const/4 p4, 0x0

    .line 38
    invoke-virtual {p0, p2, p3, v1, p4}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 39
    .line 40
    .line 41
    iget-object p5, p1, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 42
    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->I:I

    .line 46
    .line 47
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->j:I

    .line 48
    .line 49
    if-eq v0, v2, :cond_0

    .line 50
    .line 51
    iput v0, p1, Lcom/canhub/cropper/CropImageView;->k:I

    .line 52
    .line 53
    invoke-virtual {p0, p2, p3, v1, p4}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 54
    .line 55
    .line 56
    iput p4, p1, Lcom/canhub/cropper/CropImageView;->I:I

    .line 57
    .line 58
    :cond_0
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 59
    .line 60
    iget-object p3, p1, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 63
    .line 64
    .line 65
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 66
    .line 67
    if-eqz p2, :cond_1

    .line 68
    .line 69
    invoke-virtual {p2, p5}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {p0, p4, p4}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 73
    .line 74
    .line 75
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/canhub/cropper/CropOverlayView;->m()V

    .line 80
    .line 81
    .line 82
    :cond_2
    const/4 p2, 0x0

    .line 83
    iput-object p2, p1, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    iget-boolean p2, p1, Lcom/canhub/cropper/CropImageView;->J:Z

    .line 87
    .line 88
    if-eqz p2, :cond_4

    .line 89
    .line 90
    iput-boolean p4, p1, Lcom/canhub/cropper/CropImageView;->J:Z

    .line 91
    .line 92
    invoke-virtual {p0, p4, p4}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-void

    .line 96
    :cond_5
    invoke-virtual {p0, v1}, Lcom/canhub/cropper/CropImageView;->s(Z)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_6
    invoke-virtual {p0, v1}, Lcom/canhub/cropper/CropImageView;->s(Z)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public onMeasure(II)V
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    if-eqz v2, :cond_5

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 35
    .line 36
    if-ge p1, v3, :cond_1

    .line 37
    .line 38
    int-to-double v6, p1

    .line 39
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-double v8, v3

    .line 44
    div-double/2addr v6, v8

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-wide v6, v4

    .line 47
    :goto_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ge p2, v3, :cond_2

    .line 52
    .line 53
    int-to-double v8, p2

    .line 54
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    int-to-double v10, v3

    .line 59
    div-double/2addr v8, v10

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-wide v8, v4

    .line 62
    :goto_1
    cmpg-double v3, v6, v4

    .line 63
    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    cmpg-double v3, v8, v4

    .line 67
    .line 68
    if-nez v3, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    cmpg-double v3, v6, v8

    .line 80
    .line 81
    if-gtz v3, :cond_4

    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    int-to-double v2, v2

    .line 88
    mul-double/2addr v2, v6

    .line 89
    double-to-int v2, v2

    .line 90
    move v3, p1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    int-to-double v2, v2

    .line 97
    mul-double/2addr v2, v8

    .line 98
    double-to-int v3, v2

    .line 99
    move v2, p2

    .line 100
    :goto_2
    sget-object v4, Lcom/canhub/cropper/CropImageView;->N:Lcom/canhub/cropper/CropImageView$a;

    .line 101
    .line 102
    invoke-virtual {v4, v0, p1, v3}, Lcom/canhub/cropper/CropImageView$a;->a(III)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {v4, v1, p2, v2}, Lcom/canhub/cropper/CropImageView$a;->a(III)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->n:I

    .line 111
    .line 112
    iput p2, p0, Lcom/canhub/cropper/CropImageView;->o:I

    .line 113
    .line 114
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 9

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroid/os/Bundle;

    .line 7
    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_e

    .line 14
    .line 15
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 16
    .line 17
    if-nez v0, :cond_e

    .line 18
    .line 19
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    if-nez v0, :cond_e

    .line 22
    .line 23
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 24
    .line 25
    if-nez v0, :cond_e

    .line 26
    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, Landroid/os/Bundle;

    .line 29
    .line 30
    const-string v2, "LOADED_IMAGE_URI"

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v3, v2, Landroid/net/Uri;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    move-object v2, v1

    .line 41
    :cond_0
    move-object v6, v2

    .line 42
    check-cast v6, Landroid/net/Uri;

    .line 43
    .line 44
    if-eqz v6, :cond_4

    .line 45
    .line 46
    const-string v2, "LOADED_IMAGE_STATE_BITMAP_KEY"

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    sget-object v3, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/canhub/cropper/a;->q()Landroid/util/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    iget-object v2, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/graphics/Bitmap;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object v2, v1

    .line 82
    :goto_0
    move-object v4, v2

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object v4, v1

    .line 85
    :goto_1
    invoke-virtual {v3, v1}, Lcom/canhub/cropper/a;->I(Landroid/util/Pair;)V

    .line 86
    .line 87
    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    const-string v2, "LOADED_SAMPLE_SIZE"

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    move-object v3, p0

    .line 105
    invoke-virtual/range {v3 .. v8}, Lcom/canhub/cropper/CropImageView;->o(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    move-object v3, p0

    .line 110
    :goto_2
    iget-object v2, v3, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 111
    .line 112
    if-nez v2, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0, v6}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 115
    .line 116
    .line 117
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move-object v3, p0

    .line 121
    const-string v2, "LOADED_IMAGE_RESOURCE"

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-lez v2, :cond_5

    .line 128
    .line 129
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageResource(I)V

    .line 130
    .line 131
    .line 132
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    const-string v2, "LOADING_IMAGE_URI"

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    instance-of v4, v2, Landroid/net/Uri;

    .line 142
    .line 143
    if-nez v4, :cond_6

    .line 144
    .line 145
    move-object v2, v1

    .line 146
    :cond_6
    check-cast v2, Landroid/net/Uri;

    .line 147
    .line 148
    if-eqz v2, :cond_7

    .line 149
    .line 150
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 151
    .line 152
    .line 153
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 154
    .line 155
    :cond_7
    :goto_3
    const-string v2, "DEGREES_ROTATED"

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    iput v2, v3, Lcom/canhub/cropper/CropImageView;->I:I

    .line 162
    .line 163
    iput v2, v3, Lcom/canhub/cropper/CropImageView;->k:I

    .line 164
    .line 165
    const-string v2, "INITIAL_CROP_RECT"

    .line 166
    .line 167
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    instance-of v4, v2, Landroid/graphics/Rect;

    .line 172
    .line 173
    if-nez v4, :cond_8

    .line 174
    .line 175
    move-object v2, v1

    .line 176
    :cond_8
    check-cast v2, Landroid/graphics/Rect;

    .line 177
    .line 178
    if-eqz v2, :cond_a

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-gtz v4, :cond_9

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-lez v4, :cond_a

    .line 191
    .line 192
    :cond_9
    iget-object v4, v3, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 193
    .line 194
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v2}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 198
    .line 199
    .line 200
    :cond_a
    const-string v2, "CROP_WINDOW_RECT"

    .line 201
    .line 202
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    instance-of v4, v2, Landroid/graphics/RectF;

    .line 207
    .line 208
    if-nez v4, :cond_b

    .line 209
    .line 210
    move-object v2, v1

    .line 211
    :cond_b
    check-cast v2, Landroid/graphics/RectF;

    .line 212
    .line 213
    if-eqz v2, :cond_d

    .line 214
    .line 215
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    const/4 v5, 0x0

    .line 220
    cmpl-float v4, v4, v5

    .line 221
    .line 222
    if-gtz v4, :cond_c

    .line 223
    .line 224
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    cmpl-float v4, v4, v5

    .line 229
    .line 230
    if-lez v4, :cond_d

    .line 231
    .line 232
    :cond_c
    iput-object v2, v3, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 233
    .line 234
    :cond_d
    iget-object v2, v3, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 235
    .line 236
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    const-string v4, "CROP_SHAPE"

    .line 240
    .line 241
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v4}, Lcom/canhub/cropper/CropImageView$CropShape;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$CropShape;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v2, v4}, Lcom/canhub/cropper/CropOverlayView;->setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V

    .line 253
    .line 254
    .line 255
    const-string v2, "CROP_AUTO_ZOOM_ENABLED"

    .line 256
    .line 257
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    iput-boolean v2, v3, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 262
    .line 263
    const-string v2, "CROP_MAX_ZOOM"

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    iput v2, v3, Lcom/canhub/cropper/CropImageView;->z:I

    .line 270
    .line 271
    const-string v2, "CROP_FLIP_HORIZONTALLY"

    .line 272
    .line 273
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    iput-boolean v2, v3, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 278
    .line 279
    const-string v2, "CROP_FLIP_VERTICALLY"

    .line 280
    .line 281
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    iput-boolean v2, v3, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 286
    .line 287
    const-string v2, "SHOW_CROP_LABEL"

    .line 288
    .line 289
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    iput-boolean v0, v3, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 294
    .line 295
    iget-object v2, v3, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 296
    .line 297
    invoke-virtual {v2, v0}, Lcom/canhub/cropper/CropOverlayView;->setCropperTextLabelVisibility(Z)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_e
    move-object v3, p0

    .line 302
    :goto_4
    check-cast p1, Landroid/os/Bundle;

    .line 303
    .line 304
    const-string v0, "instanceState"

    .line 305
    .line 306
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    if-nez p1, :cond_f

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_f
    move-object v1, p1

    .line 314
    :goto_5
    invoke-super {p0, v1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_10
    move-object v3, p0

    .line 319
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 320
    .line 321
    .line 322
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 33
    .line 34
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    sget-object v1, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "getContext(...)"

    .line 43
    .line 44
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 48
    .line 49
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 50
    .line 51
    invoke-virtual {v1, v2, v3, v4}, Lcom/canhub/cropper/a;->K(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 57
    .line 58
    :goto_0
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v3, "toString(...)"

    .line 73
    .line 74
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object v3, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 78
    .line 79
    new-instance v4, Landroid/util/Pair;

    .line 80
    .line 81
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 84
    .line 85
    invoke-direct {v5, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v4, v2, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v4}, Lcom/canhub/cropper/a;->I(Landroid/util/Pair;)V

    .line 92
    .line 93
    .line 94
    const-string v3, "LOADED_IMAGE_STATE_BITMAP_KEY"

    .line 95
    .line 96
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 100
    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    const/4 v2, 0x0

    .line 111
    :goto_1
    if-eqz v2, :cond_4

    .line 112
    .line 113
    const-string v3, "LOADING_IMAGE_URI"

    .line 114
    .line 115
    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->g()Landroid/net/Uri;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    const-string v2, "instanceState"

    .line 123
    .line 124
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 129
    .line 130
    .line 131
    const-string v2, "LOADED_IMAGE_URI"

    .line 132
    .line 133
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "LOADED_IMAGE_RESOURCE"

    .line 137
    .line 138
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 139
    .line 140
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    const-string v1, "LOADED_SAMPLE_SIZE"

    .line 144
    .line 145
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 146
    .line 147
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    const-string v1, "DEGREES_ROTATED"

    .line 151
    .line 152
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 153
    .line 154
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 155
    .line 156
    .line 157
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 158
    .line 159
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getInitialCropWindowRect()Landroid/graphics/Rect;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const-string v2, "INITIAL_CROP_RECT"

    .line 167
    .line 168
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 169
    .line 170
    .line 171
    sget-object v1, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 178
    .line 179
    invoke-virtual {v3}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 184
    .line 185
    .line 186
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 187
    .line 188
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 191
    .line 192
    .line 193
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 194
    .line 195
    invoke-virtual {v1}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 200
    .line 201
    .line 202
    const-string v2, "CROP_WINDOW_RECT"

    .line 203
    .line 204
    invoke-virtual {v1}, Lcom/canhub/cropper/a;->u()Landroid/graphics/RectF;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 212
    .line 213
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-string v2, "CROP_SHAPE"

    .line 225
    .line 226
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string v1, "CROP_AUTO_ZOOM_ENABLED"

    .line 230
    .line 231
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 232
    .line 233
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    const-string v1, "CROP_MAX_ZOOM"

    .line 237
    .line 238
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 239
    .line 240
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 241
    .line 242
    .line 243
    const-string v1, "CROP_FLIP_HORIZONTALLY"

    .line 244
    .line 245
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 246
    .line 247
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 248
    .line 249
    .line 250
    const-string v1, "CROP_FLIP_VERTICALLY"

    .line 251
    .line 252
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 253
    .line 254
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 255
    .line 256
    .line 257
    const-string v1, "SHOW_CROP_LABEL"

    .line 258
    .line 259
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 260
    .line 261
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-lez p3, :cond_0

    .line 5
    .line 6
    if-lez p4, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->J:Z

    .line 12
    .line 13
    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x4

    .line 16
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move v0, v1

    .line 21
    :goto_0
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->e:Landroid/widget/ProgressBar;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_3
    const/4 v1, 0x4

    .line 27
    :goto_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final r(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "options"

    .line 11
    .line 12
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v4, "saveCompressFormat"

    .line 16
    .line 17
    move-object/from16 v5, p4

    .line 18
    .line 19
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v5, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-eqz v5, :cond_7

    .line 25
    .line 26
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v4, 0x0

    .line 41
    :goto_0
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->u()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget v4, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 47
    .line 48
    const/4 v6, 0x1

    .line 49
    if-gt v4, v6, :cond_3

    .line 50
    .line 51
    sget-object v4, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->b:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 52
    .line 53
    if-ne v1, v4, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    new-instance v4, Landroid/util/Pair;

    .line 57
    .line 58
    invoke-direct {v4, v3, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    new-instance v4, Landroid/util/Pair;

    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iget v6, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 69
    .line 70
    mul-int/2addr v3, v6

    .line 71
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    iget v7, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 80
    .line 81
    mul-int/2addr v6, v7

    .line 82
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-direct {v4, v3, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Ljava/lang/Integer;

    .line 92
    .line 93
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, Ljava/lang/Integer;

    .line 96
    .line 97
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 98
    .line 99
    new-instance v7, Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 100
    .line 101
    move v8, v2

    .line 102
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v9, "getContext(...)"

    .line 107
    .line 108
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object v9, v3

    .line 112
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 113
    .line 114
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object v10, v4

    .line 118
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 119
    .line 120
    move-object v11, v6

    .line 121
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    move-object v12, v7

    .line 126
    iget v7, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 127
    .line 128
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    iget-object v13, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 143
    .line 144
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v13}, Lcom/canhub/cropper/CropOverlayView;->o()Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    iget-object v14, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 152
    .line 153
    invoke-virtual {v14}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    iget-object v15, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 158
    .line 159
    invoke-virtual {v15}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    sget-object v8, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->a:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 164
    .line 165
    move/from16 v17, v9

    .line 166
    .line 167
    move v9, v10

    .line 168
    move v10, v13

    .line 169
    if-eq v1, v8, :cond_4

    .line 170
    .line 171
    move/from16 v13, p1

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_4
    const/4 v13, 0x0

    .line 175
    :goto_3
    if-eq v1, v8, :cond_5

    .line 176
    .line 177
    move/from16 v16, p2

    .line 178
    .line 179
    :goto_4
    move-object v1, v12

    .line 180
    move v12, v15

    .line 181
    goto :goto_5

    .line 182
    :cond_5
    const/16 v16, 0x0

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :goto_5
    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 186
    .line 187
    iget-boolean v8, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 188
    .line 189
    if-nez p6, :cond_6

    .line 190
    .line 191
    move-object/from16 p1, v1

    .line 192
    .line 193
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 194
    .line 195
    move-object/from16 v20, v1

    .line 196
    .line 197
    move-object/from16 v1, p1

    .line 198
    .line 199
    :goto_6
    move-object/from16 v18, p4

    .line 200
    .line 201
    move/from16 v19, p5

    .line 202
    .line 203
    move-object v0, v11

    .line 204
    move v11, v14

    .line 205
    move/from16 v14, v16

    .line 206
    .line 207
    move/from16 v16, v8

    .line 208
    .line 209
    move/from16 v8, v17

    .line 210
    .line 211
    move-object/from16 v17, p3

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_6
    move-object/from16 v20, p6

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :goto_7
    invoke-direct/range {v1 .. v20}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;-><init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    move-object/from16 v1, p0

    .line 224
    .line 225
    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 226
    .line 227
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    check-cast v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->w()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageView;->q()V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_7
    move-object v1, v0

    .line 247
    return-void
.end method

.method public final s(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 8
    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x42c80000    # 100.0f

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    sget-object v2, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->g:[F

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lcom/canhub/cropper/a;->D([F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    div-float/2addr v0, v3

    .line 22
    iget v3, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 23
    .line 24
    int-to-float v3, v3

    .line 25
    mul-float/2addr v3, v1

    .line 26
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->g:[F

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Lcom/canhub/cropper/a;->z([F)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    div-float/2addr v3, v1

    .line 33
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 34
    .line 35
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    int-to-float v4, v4

    .line 48
    invoke-virtual {v1, v2, v4, v0, v3}, Lcom/canhub/cropper/CropOverlayView;->w(FFFF)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 61
    .line 62
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v0, p1, v1, v2}, Lcom/canhub/cropper/CropOverlayView;->u([FII)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final setAutoZoomEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final setCenterMoveEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->v(Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final setCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCropLabelText(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "cropLabelText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->u:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelText(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setCropLabelTextColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->w:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelTextColor(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setCropLabelTextSize(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropLabelTextSize()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->v:F

    .line 6
    .line 7
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelTextSize(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setCropRect(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCustomOutputUri(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public final setFixedAspectRatio(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setFixedAspectRatio(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setFlippedHorizontally(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final setFlippedVertically(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/canhub/cropper/CropImageView;->b(FFZZ)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    invoke-virtual/range {v2 .. v7}, Lcom/canhub/cropper/CropImageView;->o(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setImageCropOptions(Lcom/canhub/cropper/CropImageOptions;)V
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setScaleType(Lcom/canhub/cropper/CropImageView$ScaleType;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setMultiTouchEnabled(Z)V

    .line 25
    .line 26
    .line 27
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setCenterMoveEnabled(Z)V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setShowCropOverlay(Z)V

    .line 35
    .line 36
    .line 37
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setShowProgressBar(Z)V

    .line 40
    .line 41
    .line 42
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setAutoZoomEnabled(Z)V

    .line 45
    .line 46
    .line 47
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setMaxZoom(I)V

    .line 50
    .line 51
    .line 52
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setFlippedHorizontally(Z)V

    .line 55
    .line 56
    .line 57
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setFlippedVertically(Z)V

    .line 60
    .line 61
    .line 62
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 63
    .line 64
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 65
    .line 66
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 67
    .line 68
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 69
    .line 70
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 71
    .line 72
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 73
    .line 74
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->e:Landroid/widget/ProgressBar;

    .line 75
    .line 76
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 77
    .line 78
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final setImageResource(I)V
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move v3, p1

    .line 25
    invoke-virtual/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->o(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final setImageUriAsync(Landroid/net/Uri;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->f()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->c()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    new-instance v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "getContext(...)"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v2, p0, p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;-><init>(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->i()V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->q()V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public final setMaxZoom(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final setMultiTouchEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->x(Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->j(ZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final setOnCropImageCompleteListener(Lcom/canhub/cropper/CropImageView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->B:Lcom/canhub/cropper/CropImageView$c;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnCropWindowChangedListener(Lcom/canhub/cropper/CropImageView$f;)V
    .locals 0

    return-void
.end method

.method public final setOnSetCropOverlayMovedListener(Lcom/canhub/cropper/CropImageView$d;)V
    .locals 0

    return-void
.end method

.method public final setOnSetCropOverlayReleasedListener(Lcom/canhub/cropper/CropImageView$e;)V
    .locals 0

    return-void
.end method

.method public final setOnSetImageUriCompleteListener(Lcom/canhub/cropper/CropImageView$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->A:Lcom/canhub/cropper/CropImageView$g;

    .line 2
    .line 3
    return-void
.end method

.method public final setRotatedDegrees(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageView;->n(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final setSaveBitmapToInstanceState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScaleType(Lcom/canhub/cropper/CropImageView$ScaleType;)V
    .locals 1

    .line 1
    const-string v0, "scaleType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 11
    .line 12
    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 18
    .line 19
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 20
    .line 21
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->t()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final setShowCropLabel(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropperTextLabelVisibility(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setShowCropOverlay(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->p()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setShowProgressBar(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->q()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setSnapRadius(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setSnapRadius(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
