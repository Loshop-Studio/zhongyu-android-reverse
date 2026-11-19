.class public final Lcom/canhub/cropper/CropImageOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u001a\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0002\u0008V\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00e1\u0005\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010\u000b\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010\u001f\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010 \u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010!\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010\"\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010#\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010$\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010%\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010&\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010\'\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010(\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010)\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010*\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010+\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010,\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010-\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u0010.\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u00100\u001a\u00020/\u0012\u0008\u0008\u0003\u00101\u001a\u00020\u0014\u0012\n\u0008\u0003\u00102\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u000103\u0012\u0008\u0008\u0002\u00106\u001a\u000205\u0012\u0008\u0008\u0002\u00107\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u00108\u001a\u00020\u0014\u0012\u0008\u0008\u0003\u00109\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010;\u001a\u00020:\u0012\u0008\u0008\u0002\u0010<\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\u0008\u0008\u0002\u0010?\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010@\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010A\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010B\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010C\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010D\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010E\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010/\u0012\u0008\u0008\u0003\u0010G\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010H\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010I\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\u0010\u0008\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010L\u0012\u0008\u0008\u0003\u0010N\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010O\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010J\u0012\u0008\u0008\u0003\u0010Q\u001a\u00020\u0014\u0012\n\u0008\u0003\u0010R\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0003\u0010S\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0003\u0010T\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0003\u0010U\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008V\u0010WJ\u001d\u0010\\\u001a\u00020[2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\\\u0010]J\r\u0010^\u001a\u00020\u0014\u00a2\u0006\u0004\u0008^\u0010_J\u0010\u0010`\u001a\u00020JH\u00d6\u0001\u00a2\u0006\u0004\u0008`\u0010aJ\u0010\u0010b\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008b\u0010_J\u001a\u0010e\u001a\u00020\u00022\u0008\u0010d\u001a\u0004\u0018\u00010cH\u00d6\u0003\u00a2\u0006\u0004\u0008e\u0010fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008g\u0010hR\u0016\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010hR\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR\u0016\u0010\u0008\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008n\u0010oR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008p\u0010oR\u0016\u0010\u000c\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010oR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010hR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008w\u0010hR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010hR\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010hR\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008|\u0010hR\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010hR\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010hR\u0016\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010zR\u0017\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010oR\u0017\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010hR\u0017\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0082\u0001\u0010zR\u0017\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0083\u0001\u0010zR\u0017\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0084\u0001\u0010oR\u0017\u0010 \u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0085\u0001\u0010zR\u0017\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0086\u0001\u0010oR\u0017\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0087\u0001\u0010oR\u0017\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010oR\u0017\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0089\u0001\u0010zR\u0017\u0010%\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008a\u0001\u0010zR\u0017\u0010&\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008b\u0001\u0010oR\u0017\u0010\'\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008c\u0001\u0010zR\u0016\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010zR\u0017\u0010)\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008d\u0001\u0010zR\u0017\u0010*\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008e\u0001\u0010zR\u0016\u0010+\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010zR\u0017\u0010,\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008f\u0001\u0010zR\u0017\u0010-\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0090\u0001\u0010zR\u0017\u0010.\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0091\u0001\u0010zR\u0018\u00100\u001a\u00020/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u0017\u00101\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0094\u0001\u0010zR\u001a\u00102\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u001a\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0018\u00106\u001a\u0002058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0017\u00107\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u009b\u0001\u0010zR\u0017\u00108\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u009c\u0001\u0010zR\u0017\u00109\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u009d\u0001\u0010zR\u0018\u0010;\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\u0017\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a0\u0001\u0010hR\u001a\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R\u0017\u0010?\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a3\u0001\u0010zR\u0017\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a4\u0001\u0010hR\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010hR\u0017\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a5\u0001\u0010hR\u0017\u0010C\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a6\u0001\u0010zR\u0017\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a7\u0001\u0010hR\u0017\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00a8\u0001\u0010hR\u001a\u0010F\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a9\u0001\u0010\u0093\u0001R\u0017\u0010G\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00aa\u0001\u0010zR\u0017\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00ab\u0001\u0010hR\u0017\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00ac\u0001\u0010hR\u001a\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R \u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010L8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R\u0017\u0010N\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00b1\u0001\u0010oR\u0017\u0010O\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00b2\u0001\u0010zR\u001a\u0010P\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b3\u0001\u0010\u00ae\u0001R\u0017\u0010Q\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00b4\u0001\u0010zR\u001a\u0010R\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b5\u0001\u0010\u0096\u0001R\u001a\u0010S\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b6\u0001\u0010\u0096\u0001R\u001a\u0010T\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b7\u0001\u0010\u0096\u0001R\u001a\u0010U\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0001\u0010\u0096\u0001\u00a8\u0006\u00b9\u0001"
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageOptions;",
        "Landroid/os/Parcelable;",
        "",
        "imageSourceIncludeGallery",
        "imageSourceIncludeCamera",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "cropShape",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "cornerShape",
        "",
        "cropCornerRadius",
        "snapRadius",
        "touchRadius",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "guidelines",
        "Lcom/canhub/cropper/CropImageView$ScaleType;",
        "scaleType",
        "showCropOverlay",
        "showCropLabel",
        "showProgressBar",
        "",
        "progressBarColor",
        "autoZoomEnabled",
        "multiTouchEnabled",
        "centerMoveEnabled",
        "canChangeCropWindow",
        "maxZoom",
        "initialCropWindowPaddingRatio",
        "fixAspectRatio",
        "aspectRatioX",
        "aspectRatioY",
        "borderLineThickness",
        "borderLineColor",
        "borderCornerThickness",
        "borderCornerOffset",
        "borderCornerLength",
        "borderCornerColor",
        "circleCornerFillColorHexValue",
        "guidelinesThickness",
        "guidelinesColor",
        "backgroundColor",
        "minCropWindowWidth",
        "minCropWindowHeight",
        "minCropResultWidth",
        "minCropResultHeight",
        "maxCropResultWidth",
        "maxCropResultHeight",
        "",
        "activityTitle",
        "activityMenuIconColor",
        "activityMenuTextColor",
        "Landroid/net/Uri;",
        "customOutputUri",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "outputCompressFormat",
        "outputCompressQuality",
        "outputRequestWidth",
        "outputRequestHeight",
        "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;",
        "outputRequestSizeOptions",
        "noOutputImage",
        "Landroid/graphics/Rect;",
        "initialCropWindowRectangle",
        "initialRotation",
        "allowRotation",
        "allowFlipping",
        "allowCounterRotation",
        "rotationDegrees",
        "flipHorizontally",
        "flipVertically",
        "cropMenuCropButtonTitle",
        "cropMenuCropButtonIcon",
        "skipEditing",
        "showIntentChooser",
        "",
        "intentChooserTitle",
        "",
        "intentChooserPriorityList",
        "cropperLabelTextSize",
        "cropperLabelTextColor",
        "cropperLabelText",
        "activityBackgroundColor",
        "toolbarColor",
        "toolbarTitleColor",
        "toolbarBackButtonColor",
        "toolbarTintColor",
        "<init>",
        "(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "b",
        "c",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "d",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "e",
        "F",
        "f",
        "g",
        "h",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "i",
        "Lcom/canhub/cropper/CropImageView$ScaleType;",
        "j",
        "k",
        "l",
        "m",
        "I",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z",
        "A",
        "B",
        "C",
        "D",
        "E",
        "G",
        "H",
        "J",
        "K",
        "L",
        "M",
        "Ljava/lang/CharSequence;",
        "N",
        "O",
        "Ljava/lang/Integer;",
        "P",
        "Landroid/net/Uri;",
        "Q",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "R",
        "S",
        "T",
        "U",
        "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;",
        "V",
        "W",
        "Landroid/graphics/Rect;",
        "X",
        "Y",
        "c0",
        "d0",
        "e0",
        "f0",
        "g0",
        "h0",
        "i0",
        "j0",
        "k0",
        "Ljava/lang/String;",
        "l0",
        "Ljava/util/List;",
        "m0",
        "n0",
        "o0",
        "p0",
        "q0",
        "r0",
        "s0",
        "t0",
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
        "SMAP\nCropImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageOptions.kt\ncom/canhub/cropper/CropImageOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"
    }
.end annotation

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/canhub/cropper/CropImageOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:F

.field public B:I

.field public C:I

.field public D:F

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:Ljava/lang/CharSequence;

.field public N:I

.field public O:Ljava/lang/Integer;

.field public P:Landroid/net/Uri;

.field public Q:Landroid/graphics/Bitmap$CompressFormat;

.field public R:I

.field public S:I

.field public T:I

.field public U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

.field public V:Z

.field public W:Landroid/graphics/Rect;

.field public X:I

.field public Y:Z

.field public Z:Z

.field public a:Z

.field public b:Z

.field public c:Lcom/canhub/cropper/CropImageView$CropShape;

.field public c0:Z

.field public d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

.field public d0:I

.field public e:F

.field public e0:Z

.field public f:F

.field public f0:Z

.field public g:F

.field public g0:Ljava/lang/CharSequence;

.field public h:Lcom/canhub/cropper/CropImageView$Guidelines;

.field public h0:I

.field public i:Lcom/canhub/cropper/CropImageView$ScaleType;

.field public i0:Z

.field public j:Z

.field public j0:Z

.field public k:Z

.field public k0:Ljava/lang/String;

.field public l:Z

.field public l0:Ljava/util/List;

.field public m:I

.field public m0:F

.field public n:Z

.field public n0:I

.field public o:Z

.field public o0:Ljava/lang/String;

.field public p:Z

.field public p0:I

.field public q:Z

.field public q0:Ljava/lang/Integer;

.field public r:I

.field public r0:Ljava/lang/Integer;

.field public s:F

.field public s0:Ljava/lang/Integer;

.field public t:Z

.field public t0:Ljava/lang/Integer;

.field public u:I

.field public v:I

.field public w:F

.field public x:I

.field public y:F

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/canhub/cropper/CropImageOptions$a;

    invoke-direct {v0}, Lcom/canhub/cropper/CropImageOptions$a;-><init>()V

    sput-object v0, Lcom/canhub/cropper/CropImageOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move/from16 v6, p18

    move/from16 v7, p19

    move/from16 v8, p21

    move/from16 v9, p22

    move/from16 v10, p23

    move/from16 v11, p25

    move-object/from16 v15, p39

    move-object/from16 v14, p43

    move-object/from16 v13, p47

    const-string v12, "cropShape"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "cornerShape"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "guidelines"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "scaleType"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "activityTitle"

    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "outputCompressFormat"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "outputRequestSizeOptions"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move/from16 v12, p1

    .line 2
    iput-boolean v12, v0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    move/from16 v12, p2

    .line 3
    iput-boolean v12, v0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 4
    iput-object v1, v0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 5
    iput-object v2, v0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move/from16 v1, p5

    .line 6
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->e:F

    move/from16 v1, p6

    .line 7
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 8
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 9
    iput-object v4, v0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 10
    iput-object v5, v0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    move/from16 v1, p10

    .line 11
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    move/from16 v1, p11

    .line 12
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    move/from16 v1, p12

    .line 13
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    move/from16 v1, p13

    .line 14
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->m:I

    move/from16 v1, p14

    .line 15
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    move/from16 v1, p15

    .line 16
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    move/from16 v1, p16

    .line 17
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    move/from16 v1, p17

    .line 18
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 19
    iput v6, v0, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 20
    iput v7, v0, Lcom/canhub/cropper/CropImageOptions;->s:F

    move/from16 v1, p20

    .line 21
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 22
    iput v8, v0, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 23
    iput v9, v0, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 24
    iput v10, v0, Lcom/canhub/cropper/CropImageOptions;->w:F

    move/from16 v1, p24

    .line 25
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 26
    iput v11, v0, Lcom/canhub/cropper/CropImageOptions;->y:F

    move/from16 v1, p26

    .line 27
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->z:F

    move/from16 v1, p27

    .line 28
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->A:F

    move/from16 v1, p28

    .line 29
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->B:I

    move/from16 v1, p29

    .line 30
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->C:I

    move/from16 v12, p30

    .line 31
    iput v12, v0, Lcom/canhub/cropper/CropImageOptions;->D:F

    move/from16 v1, p31

    .line 32
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->E:I

    move/from16 v1, p32

    .line 33
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->F:I

    move/from16 v1, p33

    .line 34
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->G:I

    move/from16 v1, p34

    .line 35
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->H:I

    move/from16 v2, p35

    .line 36
    iput v2, v0, Lcom/canhub/cropper/CropImageOptions;->I:I

    move/from16 v4, p36

    .line 37
    iput v4, v0, Lcom/canhub/cropper/CropImageOptions;->J:I

    move/from16 v5, p37

    .line 38
    iput v5, v0, Lcom/canhub/cropper/CropImageOptions;->K:I

    move/from16 v1, p38

    .line 39
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 40
    iput-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    move/from16 v15, p40

    .line 41
    iput v15, v0, Lcom/canhub/cropper/CropImageOptions;->N:I

    move-object/from16 v15, p41

    .line 42
    iput-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    move-object/from16 v15, p42

    .line 43
    iput-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 44
    iput-object v14, v0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 v14, p44

    .line 45
    iput v14, v0, Lcom/canhub/cropper/CropImageOptions;->R:I

    move/from16 v14, p45

    .line 46
    iput v14, v0, Lcom/canhub/cropper/CropImageOptions;->S:I

    move/from16 v15, p46

    .line 47
    iput v15, v0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 48
    iput-object v13, v0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    move/from16 v13, p48

    .line 49
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    move-object/from16 v13, p49

    .line 50
    iput-object v13, v0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    move/from16 v13, p50

    .line 51
    iput v13, v0, Lcom/canhub/cropper/CropImageOptions;->X:I

    move/from16 v13, p51

    .line 52
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    move/from16 v13, p52

    .line 53
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    move/from16 v13, p53

    .line 54
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    move/from16 v13, p54

    .line 55
    iput v13, v0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    move/from16 v3, p55

    .line 56
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    move/from16 v3, p56

    .line 57
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    move-object/from16 v3, p57

    .line 58
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    move/from16 v3, p58

    .line 59
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    move/from16 v3, p59

    .line 60
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    move/from16 v3, p60

    .line 61
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    move-object/from16 v3, p61

    .line 62
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    move-object/from16 v3, p62

    .line 63
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    move/from16 v3, p63

    .line 64
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    move/from16 v3, p64

    .line 65
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    move-object/from16 v3, p65

    .line 66
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    move/from16 v3, p66

    .line 67
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    move-object/from16 v3, p67

    .line 68
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    move-object/from16 v3, p68

    .line 69
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    move-object/from16 v3, p69

    .line 70
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    move-object/from16 v3, p70

    .line 71
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    if-ltz v6, :cond_f

    const/4 v3, 0x0

    cmpl-float v6, p7, v3

    if-ltz v6, :cond_e

    cmpg-float v6, v7, v3

    if-ltz v6, :cond_d

    float-to-double v6, v7

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    cmpl-double v6, v6, v16

    if-gez v6, :cond_d

    .line 72
    const-string v6, "Cannot set aspect ratio value to a number less than or equal to 0."

    if-lez v8, :cond_c

    if-lez v9, :cond_b

    cmpl-float v6, v10, v3

    if-ltz v6, :cond_a

    cmpl-float v6, v11, v3

    if-ltz v6, :cond_9

    cmpl-float v3, v12, v3

    if-ltz v3, :cond_8

    if-ltz p34, :cond_7

    if-ltz v2, :cond_6

    if-ltz v4, :cond_5

    if-lt v5, v2, :cond_4

    if-lt v1, v4, :cond_3

    if-ltz v14, :cond_2

    if-ltz v15, :cond_1

    if-ltz v13, :cond_0

    const/16 v1, 0x168

    if-gt v13, v1, :cond_0

    return-void

    .line 73
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set rotation degrees value to a number < 0 or > 360"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 74
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set request height value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 75
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set request width value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 76
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set max crop result height to smaller value than min crop result height"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set max crop result width to smaller value than min crop result width"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 78
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set min crop result height value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 79
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set min crop result width value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 80
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set min crop window height value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 81
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set guidelines thickness value to a number less than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 82
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set corner thickness value to a number less than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 83
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set line thickness value to a number less than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 84
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 85
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 86
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set initial crop window padding value to a number < 0 or >= 0.5"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set touch radius value to a number <= 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 88
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set max zoom to a number < 1"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 50

    move/from16 v0, p71

    move/from16 v1, p72

    and-int/lit8 v2, v0, 0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    .line 89
    sget-object v5, Lcom/canhub/cropper/CropImageView$CropShape;->a:Lcom/canhub/cropper/CropImageView$CropShape;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    .line 90
    sget-object v6, Lcom/canhub/cropper/CropImageView$CropCornerShape;->a:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    .line 91
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    const/high16 v8, 0x41200000    # 10.0f

    invoke-static {v3, v8, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v7

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    const/high16 v9, 0x40400000    # 3.0f

    if-eqz v8, :cond_5

    .line 92
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    invoke-static {v3, v9, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v8

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    .line 93
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    const/high16 v11, 0x41c00000    # 24.0f

    invoke-static {v3, v11, v10}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v10

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    .line 94
    sget-object v11, Lcom/canhub/cropper/CropImageView$Guidelines;->c:Lcom/canhub/cropper/CropImageView$Guidelines;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    .line 95
    sget-object v12, Lcom/canhub/cropper/CropImageView$ScaleType;->a:Lcom/canhub/cropper/CropImageView$ScaleType;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    move v13, v3

    goto :goto_9

    :cond_9
    move/from16 v13, p10

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, 0x0

    goto :goto_a

    :cond_a
    move/from16 v14, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    move v15, v3

    goto :goto_b

    :cond_b
    move/from16 v15, p12

    :goto_b
    and-int/lit16 v3, v0, 0x1000

    if-eqz v3, :cond_c

    const/16 v3, 0x33

    const/16 v9, 0x99

    .line 96
    invoke-static {v9, v3, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    goto :goto_c

    :cond_c
    move/from16 v3, p13

    :goto_c
    and-int/lit16 v9, v0, 0x2000

    if-eqz v9, :cond_d

    const/4 v9, 0x1

    goto :goto_d

    :cond_d
    move/from16 v9, p14

    :goto_d
    move/from16 v16, v2

    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v17, 0x8000

    and-int v18, v0, v17

    if-eqz v18, :cond_f

    const/16 v18, 0x1

    goto :goto_f

    :cond_f
    move/from16 v18, p16

    :goto_f
    const/high16 v19, 0x10000

    and-int v19, v0, v19

    if-eqz v19, :cond_10

    const/16 v19, 0x1

    goto :goto_10

    :cond_10
    move/from16 v19, p17

    :goto_10
    const/high16 v20, 0x20000

    and-int v20, v0, v20

    if-eqz v20, :cond_11

    const/16 v20, 0x4

    goto :goto_11

    :cond_11
    move/from16 v20, p18

    :goto_11
    const/high16 v21, 0x40000

    and-int v21, v0, v21

    if-eqz v21, :cond_12

    const/16 v21, 0x0

    goto :goto_12

    :cond_12
    move/from16 v21, p19

    :goto_12
    const/high16 v22, 0x80000

    and-int v22, v0, v22

    if-eqz v22, :cond_13

    const/16 v22, 0x0

    goto :goto_13

    :cond_13
    move/from16 v22, p20

    :goto_13
    const/high16 v23, 0x100000

    and-int v23, v0, v23

    if-eqz v23, :cond_14

    const/16 v23, 0x1

    goto :goto_14

    :cond_14
    move/from16 v23, p21

    :goto_14
    const/high16 v24, 0x200000

    and-int v24, v0, v24

    if-eqz v24, :cond_15

    const/16 v24, 0x1

    goto :goto_15

    :cond_15
    move/from16 v24, p22

    :goto_15
    const/high16 v25, 0x400000

    and-int v25, v0, v25

    if-eqz v25, :cond_16

    .line 97
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    move/from16 p3, v2

    move/from16 p2, v3

    const/high16 v2, 0x40400000    # 3.0f

    const/4 v3, 0x1

    invoke-static {v3, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_16

    :cond_16
    move/from16 p3, v2

    move/from16 p2, v3

    move/from16 v0, p23

    :goto_16
    const/high16 v2, 0x800000

    and-int v2, p71, v2

    const/16 v3, 0xff

    if-eqz v2, :cond_17

    const/16 v2, 0xaa

    .line 98
    invoke-static {v2, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    goto :goto_17

    :cond_17
    move/from16 v2, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, p71, v25

    if-eqz v25, :cond_18

    .line 99
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    move/from16 p5, v0

    const/high16 v0, 0x40000000    # 2.0f

    move/from16 p6, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_18

    :cond_18
    move/from16 p5, v0

    move/from16 p6, v2

    const/4 v2, 0x1

    move/from16 v0, p25

    :goto_18
    const/high16 v3, 0x2000000

    and-int v3, p71, v3

    if-eqz v3, :cond_19

    .line 100
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    move/from16 p7, v0

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v2, v0, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_19

    :cond_19
    move/from16 p7, v0

    move/from16 v0, p26

    :goto_19
    const/high16 v3, 0x4000000

    and-int v3, p71, v3

    if-eqz v3, :cond_1a

    .line 101
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    move/from16 p8, v0

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v2, v0, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_1a

    :cond_1a
    move/from16 p8, v0

    move/from16 v0, p27

    :goto_1a
    const/high16 v2, 0x8000000

    and-int v2, p71, v2

    if-eqz v2, :cond_1b

    const/4 v2, -0x1

    goto :goto_1b

    :cond_1b
    move/from16 v2, p28

    :goto_1b
    const/high16 v25, 0x10000000

    and-int v25, p71, v25

    if-eqz v25, :cond_1c

    const/16 v25, -0x1

    goto :goto_1c

    :cond_1c
    move/from16 v25, p29

    :goto_1c
    const/high16 v26, 0x20000000

    and-int v26, p71, v26

    if-eqz v26, :cond_1d

    .line 102
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    move/from16 p10, v0

    const/high16 v0, 0x3f800000    # 1.0f

    move/from16 p11, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_1d

    :cond_1d
    move/from16 p10, v0

    move/from16 p11, v2

    move/from16 v0, p30

    :goto_1d
    const/high16 v2, 0x40000000    # 2.0f

    and-int v2, p71, v2

    if-eqz v2, :cond_1e

    const/16 v2, 0xaa

    const/16 v3, 0xff

    .line 103
    invoke-static {v2, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    goto :goto_1e

    :cond_1e
    move/from16 v2, p31

    :goto_1e
    const/high16 v3, -0x80000000

    and-int v3, p71, v3

    if-eqz v3, :cond_1f

    const/16 v3, 0x77

    move/from16 p4, v0

    const/4 v0, 0x0

    .line 104
    invoke-static {v3, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    goto :goto_1f

    :cond_1f
    move/from16 p4, v0

    const/4 v0, 0x0

    move/from16 v3, p32

    :goto_1f
    and-int/lit8 v26, v1, 0x1

    if-eqz v26, :cond_20

    .line 105
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    move/from16 p12, v2

    const/high16 v2, 0x42280000    # 42.0f

    move/from16 p13, v3

    const/4 v3, 0x1

    invoke-static {v3, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    goto :goto_20

    :cond_20
    move/from16 p12, v2

    move/from16 p13, v3

    const/4 v3, 0x1

    move/from16 v0, p33

    :goto_20
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_21

    .line 106
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    move/from16 p14, v0

    const/high16 v0, 0x42280000    # 42.0f

    invoke-static {v3, v0, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    goto :goto_21

    :cond_21
    move/from16 p14, v0

    move/from16 v0, p34

    :goto_21
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_22

    const/16 v2, 0x28

    goto :goto_22

    :cond_22
    move/from16 v2, p35

    :goto_22
    and-int/lit8 v26, v1, 0x8

    if-eqz v26, :cond_23

    const/16 v26, 0x28

    goto :goto_23

    :cond_23
    move/from16 v26, p36

    :goto_23
    and-int/lit8 v27, v1, 0x10

    if-eqz v27, :cond_24

    const v27, 0x1869f

    goto :goto_24

    :cond_24
    move/from16 v27, p37

    :goto_24
    and-int/lit8 v28, v1, 0x20

    if-eqz v28, :cond_25

    const v28, 0x1869f

    goto :goto_25

    :cond_25
    move/from16 v28, p38

    :goto_25
    and-int/lit8 v29, v1, 0x40

    if-eqz v29, :cond_26

    .line 107
    const-string v29, ""

    goto :goto_26

    :cond_26
    move-object/from16 v29, p39

    :goto_26
    and-int/lit16 v3, v1, 0x80

    if-eqz v3, :cond_27

    const/4 v3, 0x0

    goto :goto_27

    :cond_27
    move/from16 v3, p40

    :goto_27
    move/from16 p15, v0

    and-int/lit16 v0, v1, 0x100

    const/16 v30, 0x0

    if-eqz v0, :cond_28

    move-object/from16 v0, v30

    goto :goto_28

    :cond_28
    move-object/from16 v0, p41

    :goto_28
    move-object/from16 p16, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    move-object/from16 v0, v30

    goto :goto_29

    :cond_29
    move-object/from16 v0, p42

    :goto_29
    move-object/from16 p17, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    .line 108
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_2a

    :cond_2a
    move-object/from16 v0, p43

    :goto_2a
    move-object/from16 p18, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    const/16 v0, 0x5a

    goto :goto_2b

    :cond_2b
    move/from16 v0, p44

    :goto_2b
    move/from16 p19, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    move/from16 v0, p45

    :goto_2c
    move/from16 p20, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move/from16 v0, p46

    :goto_2d
    move/from16 p21, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    .line 109
    sget-object v0, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->a:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    goto :goto_2e

    :cond_2e
    move-object/from16 v0, p47

    :goto_2e
    and-int v17, v1, v17

    if-eqz v17, :cond_2f

    const/16 v17, 0x0

    goto :goto_2f

    :cond_2f
    move/from16 v17, p48

    :goto_2f
    const/high16 v31, 0x10000

    and-int v31, v1, v31

    if-eqz v31, :cond_30

    move-object/from16 v31, v30

    goto :goto_30

    :cond_30
    move-object/from16 v31, p49

    :goto_30
    const/high16 v32, 0x20000

    and-int v32, v1, v32

    if-eqz v32, :cond_31

    const/16 v32, -0x1

    goto :goto_31

    :cond_31
    move/from16 v32, p50

    :goto_31
    const/high16 v33, 0x40000

    and-int v33, v1, v33

    if-eqz v33, :cond_32

    const/16 v33, 0x1

    goto :goto_32

    :cond_32
    move/from16 v33, p51

    :goto_32
    const/high16 v34, 0x80000

    and-int v34, v1, v34

    if-eqz v34, :cond_33

    const/16 v34, 0x1

    goto :goto_33

    :cond_33
    move/from16 v34, p52

    :goto_33
    const/high16 v35, 0x100000

    and-int v35, v1, v35

    if-eqz v35, :cond_34

    const/16 v35, 0x0

    goto :goto_34

    :cond_34
    move/from16 v35, p53

    :goto_34
    const/high16 v36, 0x200000

    and-int v36, v1, v36

    if-eqz v36, :cond_35

    const/16 v36, 0x5a

    goto :goto_35

    :cond_35
    move/from16 v36, p54

    :goto_35
    const/high16 v37, 0x400000

    and-int v37, v1, v37

    if-eqz v37, :cond_36

    const/16 v37, 0x0

    goto :goto_36

    :cond_36
    move/from16 v37, p55

    :goto_36
    const/high16 v38, 0x800000

    and-int v38, v1, v38

    if-eqz v38, :cond_37

    const/16 v38, 0x0

    goto :goto_37

    :cond_37
    move/from16 v38, p56

    :goto_37
    const/high16 v39, 0x1000000

    and-int v39, v1, v39

    if-eqz v39, :cond_38

    move-object/from16 v39, v30

    goto :goto_38

    :cond_38
    move-object/from16 v39, p57

    :goto_38
    const/high16 v40, 0x2000000

    and-int v40, v1, v40

    if-eqz v40, :cond_39

    const/16 v40, 0x0

    goto :goto_39

    :cond_39
    move/from16 v40, p58

    :goto_39
    const/high16 v41, 0x4000000

    and-int v41, v1, v41

    if-eqz v41, :cond_3a

    const/16 v41, 0x0

    goto :goto_3a

    :cond_3a
    move/from16 v41, p59

    :goto_3a
    const/high16 v42, 0x8000000

    and-int v42, v1, v42

    if-eqz v42, :cond_3b

    const/16 v42, 0x0

    goto :goto_3b

    :cond_3b
    move/from16 v42, p60

    :goto_3b
    const/high16 v43, 0x10000000

    and-int v43, v1, v43

    if-eqz v43, :cond_3c

    move-object/from16 v43, v30

    goto :goto_3c

    :cond_3c
    move-object/from16 v43, p61

    :goto_3c
    const/high16 v44, 0x20000000

    and-int v44, v1, v44

    if-eqz v44, :cond_3d

    .line 110
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v44

    goto :goto_3d

    :cond_3d
    move-object/from16 v44, p62

    :goto_3d
    const/high16 v45, 0x40000000    # 2.0f

    and-int v45, v1, v45

    if-eqz v45, :cond_3e

    .line 111
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v45

    move-object/from16 p1, v0

    invoke-virtual/range {v45 .. v45}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x2

    move/from16 p22, v2

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_3e

    :cond_3e
    move-object/from16 p1, v0

    move/from16 p22, v2

    move/from16 v0, p63

    :goto_3e
    const/high16 v1, -0x80000000

    and-int v1, p72, v1

    if-eqz v1, :cond_3f

    const/4 v1, -0x1

    goto :goto_3f

    :cond_3f
    move/from16 v1, p64

    :goto_3f
    and-int/lit8 v2, p73, 0x1

    if-eqz v2, :cond_40

    .line 112
    const-string v2, ""

    goto :goto_40

    :cond_40
    move-object/from16 v2, p65

    :goto_40
    and-int/lit8 v45, p73, 0x2

    if-eqz v45, :cond_41

    const/16 v45, -0x1

    goto :goto_41

    :cond_41
    move/from16 v45, p66

    :goto_41
    and-int/lit8 v46, p73, 0x4

    if-eqz v46, :cond_42

    move-object/from16 v46, v30

    goto :goto_42

    :cond_42
    move-object/from16 v46, p67

    :goto_42
    and-int/lit8 v47, p73, 0x8

    if-eqz v47, :cond_43

    move-object/from16 v47, v30

    goto :goto_43

    :cond_43
    move-object/from16 v47, p68

    :goto_43
    and-int/lit8 v48, p73, 0x10

    if-eqz v48, :cond_44

    move-object/from16 v48, v30

    goto :goto_44

    :cond_44
    move-object/from16 v48, p69

    :goto_44
    and-int/lit8 v49, p73, 0x20

    if-eqz v49, :cond_45

    move-object/from16 p71, v30

    :goto_45
    move-object/from16 p48, p1

    move/from16 p31, p4

    move/from16 p24, p5

    move/from16 p25, p6

    move/from16 p26, p7

    move/from16 p27, p8

    move/from16 p28, p10

    move/from16 p29, p11

    move/from16 p32, p12

    move/from16 p33, p13

    move/from16 p34, p14

    move/from16 p35, p15

    move-object/from16 p42, p16

    move-object/from16 p43, p17

    move-object/from16 p44, p18

    move/from16 p45, p19

    move/from16 p46, p20

    move/from16 p47, p21

    move/from16 p36, p22

    move/from16 p64, v0

    move/from16 p65, v1

    move-object/from16 p66, v2

    move/from16 p41, v3

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p15, v9

    move/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move/from16 p11, v13

    move/from16 p12, v14

    move/from16 p13, v15

    move/from16 p49, v17

    move/from16 p17, v18

    move/from16 p18, v19

    move/from16 p19, v20

    move/from16 p20, v21

    move/from16 p21, v22

    move/from16 p22, v23

    move/from16 p23, v24

    move/from16 p30, v25

    move/from16 p37, v26

    move/from16 p38, v27

    move/from16 p39, v28

    move-object/from16 p40, v29

    move-object/from16 p50, v31

    move/from16 p51, v32

    move/from16 p52, v33

    move/from16 p53, v34

    move/from16 p54, v35

    move/from16 p55, v36

    move/from16 p56, v37

    move/from16 p57, v38

    move-object/from16 p58, v39

    move/from16 p59, v40

    move/from16 p60, v41

    move/from16 p61, v42

    move-object/from16 p62, v43

    move-object/from16 p63, v44

    move/from16 p67, v45

    move-object/from16 p68, v46

    move-object/from16 p69, v47

    move-object/from16 p70, v48

    move-object/from16 p1, p0

    move/from16 p14, p2

    move/from16 p16, p3

    move/from16 p3, v4

    move/from16 p2, v16

    goto :goto_46

    :cond_45
    move-object/from16 p71, p70

    goto/16 :goto_45

    .line 113
    :goto_46
    invoke-direct/range {p1 .. p71}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/canhub/cropper/CropImageOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/canhub/cropper/CropImageOptions;

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->g:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->m:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->o:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->p:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->q:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->r:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->s:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->t:Z

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->u:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->v:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->x:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->z:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->A:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->B:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->C:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->D:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->E:I

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->F:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->G:I

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->H:I

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->I:I

    if-eq v1, v3, :cond_24

    return v2

    :cond_24
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->J:I

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->K:I

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->L:I

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->N:I

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->R:I

    if-eq v1, v3, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->S:I

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->T:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->V:Z

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->X:I

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->d0:I

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    if-eq v1, v3, :cond_39

    return v2

    :cond_39
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    return v2

    :cond_3a
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->h0:I

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    return v2

    :cond_3e
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    return v2

    :cond_3f
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->m0:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_40

    return v2

    :cond_40
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->n0:I

    if-eq v1, v3, :cond_41

    return v2

    :cond_41
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    return v2

    :cond_42
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->p0:I

    if-eq v1, v3, :cond_43

    return v2

    :cond_43
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    return v2

    :cond_44
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_45

    return v2

    :cond_45
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_46

    return v2

    :cond_46
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_47

    return v2

    :cond_47
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Rect;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 72

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    iget-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    iget-object v4, v0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    iget v5, v0, Lcom/canhub/cropper/CropImageOptions;->e:F

    iget v6, v0, Lcom/canhub/cropper/CropImageOptions;->f:F

    iget v7, v0, Lcom/canhub/cropper/CropImageOptions;->g:F

    iget-object v8, v0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    iget-object v9, v0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    iget-boolean v10, v0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    iget-boolean v11, v0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    iget-boolean v12, v0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    iget v13, v0, Lcom/canhub/cropper/CropImageOptions;->m:I

    iget-boolean v14, v0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    move/from16 v17, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    move/from16 v18, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->r:I

    move/from16 v19, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->s:F

    move/from16 v20, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    move/from16 v21, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->u:I

    move/from16 v22, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->v:I

    move/from16 v23, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->w:F

    move/from16 v24, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->x:I

    move/from16 v25, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->y:F

    move/from16 v26, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->z:F

    move/from16 v27, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->A:F

    move/from16 v28, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->B:I

    move/from16 v29, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->C:I

    move/from16 v30, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->D:F

    move/from16 v31, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->E:I

    move/from16 v32, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->F:I

    move/from16 v33, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->G:I

    move/from16 v34, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->H:I

    move/from16 v35, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->I:I

    move/from16 v36, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->J:I

    move/from16 v37, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->K:I

    move/from16 v38, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->L:I

    move/from16 v39, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    move-object/from16 v40, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->N:I

    move/from16 v41, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    move-object/from16 v43, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    move-object/from16 v44, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->R:I

    move/from16 v45, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->S:I

    move/from16 v46, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->T:I

    move/from16 v47, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    move-object/from16 v48, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    move/from16 v49, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    move-object/from16 v50, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->X:I

    move/from16 v51, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    move/from16 v52, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    move/from16 v53, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    move/from16 v54, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    move/from16 v55, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    move/from16 v56, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    move/from16 v57, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    move-object/from16 v58, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    move/from16 v59, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    move/from16 v60, v15

    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    move/from16 v61, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    move-object/from16 v62, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    move-object/from16 v63, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    move/from16 v64, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    move/from16 v65, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    move-object/from16 v66, v15

    iget v15, v0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    move/from16 v67, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    move-object/from16 v68, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    move-object/from16 v69, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    move-object/from16 v70, v15

    iget-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v71, v15

    const-string v15, "CropImageOptions(imageSourceIncludeGallery="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", imageSourceIncludeCamera="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cropShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cornerShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cropCornerRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", snapRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", touchRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", guidelines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scaleType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showCropOverlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showCropLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showProgressBar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", progressBarColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", autoZoomEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", multiTouchEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", centerMoveEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", canChangeCropWindow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxZoom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", initialCropWindowPaddingRatio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fixAspectRatio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", aspectRatioX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", aspectRatioY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", borderLineThickness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", borderLineColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", borderCornerThickness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", borderCornerOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", borderCornerLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", borderCornerColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", circleCornerFillColorHexValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", guidelinesThickness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", guidelinesColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minCropWindowWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minCropWindowHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minCropResultWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minCropResultHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxCropResultWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxCropResultHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activityTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activityMenuIconColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activityMenuTextColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customOutputUri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputCompressFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputCompressQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outputRequestWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outputRequestHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outputRequestSizeOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noOutputImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", initialCropWindowRectangle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialRotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", allowRotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowFlipping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowCounterRotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v55

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", flipHorizontally="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v56

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", flipVertically="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cropMenuCropButtonTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v58

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cropMenuCropButtonIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", skipEditing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v60

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showIntentChooser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", intentChooserTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v62

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", intentChooserPriorityList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v63

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cropperLabelTextSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cropperLabelTextColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v65

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cropperLabelText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v66

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activityBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v67

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", toolbarColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toolbarTitleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v69

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toolbarBackButtonColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toolbarTintColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 42
    .line 43
    .line 44
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    .line 71
    .line 72
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 75
    .line 76
    .line 77
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 100
    .line 101
    .line 102
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    .line 106
    .line 107
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    .line 111
    .line 112
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 115
    .line 116
    .line 117
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    .line 121
    .line 122
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    .line 126
    .line 127
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    .line 131
    .line 132
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 135
    .line 136
    .line 137
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    .line 141
    .line 142
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 145
    .line 146
    .line 147
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 150
    .line 151
    .line 152
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 155
    .line 156
    .line 157
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    .line 161
    .line 162
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    .line 166
    .line 167
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 170
    .line 171
    .line 172
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    .line 173
    .line 174
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    .line 176
    .line 177
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 180
    .line 181
    .line 182
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 185
    .line 186
    .line 187
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    .line 196
    .line 197
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 200
    .line 201
    .line 202
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    .line 203
    .line 204
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    .line 206
    .line 207
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 208
    .line 209
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    .line 213
    .line 214
    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 215
    .line 216
    .line 217
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 218
    .line 219
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    .line 223
    .line 224
    const/4 v1, 0x1

    .line 225
    const/4 v2, 0x0

    .line 226
    if-nez v0, :cond_0

    .line 227
    .line 228
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 240
    .line 241
    .line 242
    :goto_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 243
    .line 244
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    .line 257
    .line 258
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 259
    .line 260
    .line 261
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    .line 262
    .line 263
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 264
    .line 265
    .line 266
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 267
    .line 268
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    .line 281
    .line 282
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 283
    .line 284
    .line 285
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    .line 286
    .line 287
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 288
    .line 289
    .line 290
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    .line 291
    .line 292
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 293
    .line 294
    .line 295
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    .line 296
    .line 297
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 298
    .line 299
    .line 300
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    .line 301
    .line 302
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 303
    .line 304
    .line 305
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    .line 306
    .line 307
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 308
    .line 309
    .line 310
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    .line 311
    .line 312
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 313
    .line 314
    .line 315
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 316
    .line 317
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 318
    .line 319
    .line 320
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 321
    .line 322
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 323
    .line 324
    .line 325
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    .line 326
    .line 327
    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 328
    .line 329
    .line 330
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    .line 331
    .line 332
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 333
    .line 334
    .line 335
    iget-boolean p2, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    .line 336
    .line 337
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 338
    .line 339
    .line 340
    iget-boolean p2, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    .line 341
    .line 342
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 343
    .line 344
    .line 345
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    .line 351
    .line 352
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 353
    .line 354
    .line 355
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 356
    .line 357
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 358
    .line 359
    .line 360
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    .line 361
    .line 362
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 363
    .line 364
    .line 365
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    .line 371
    .line 372
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 373
    .line 374
    .line 375
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    .line 376
    .line 377
    if-nez p2, :cond_1

    .line 378
    .line 379
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 380
    .line 381
    .line 382
    goto :goto_1

    .line 383
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result p2

    .line 390
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 391
    .line 392
    .line 393
    :goto_1
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    .line 394
    .line 395
    if-nez p2, :cond_2

    .line 396
    .line 397
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result p2

    .line 408
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 409
    .line 410
    .line 411
    :goto_2
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    .line 412
    .line 413
    if-nez p2, :cond_3

    .line 414
    .line 415
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 416
    .line 417
    .line 418
    goto :goto_3

    .line 419
    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result p2

    .line 426
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 427
    .line 428
    .line 429
    :goto_3
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    .line 430
    .line 431
    if-nez p2, :cond_4

    .line 432
    .line 433
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_4
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 445
    .line 446
    .line 447
    return-void
.end method
