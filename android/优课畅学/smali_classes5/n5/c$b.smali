.class public Ln5/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/c;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ln5/c;


# direct methods
.method public constructor <init>(Ln5/c;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln5/c$b;->b:Ln5/c;

    .line 2
    .line 3
    iput-object p2, p0, Ln5/c$b;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    iget-object p2, p0, Ln5/c$b;->b:Ln5/c;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/c;->f(Ln5/c;)Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Ln5/c$b;->b:Ln5/c;

    .line 10
    .line 11
    invoke-static {p2}, Ln5/c;->f(Ln5/c;)Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/tencent/rtmp/TXLivePlayer;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p2, 0x0

    .line 23
    :goto_0
    iget-object v0, p0, Ln5/c$b;->b:Ln5/c;

    .line 24
    .line 25
    invoke-static {v0}, Ln5/c;->g(Ln5/c;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, ".flv"

    .line 30
    .line 31
    const-string v2, "_900.flv"

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Lcom/tencent/rtmp/TXLivePlayer;->switchStream(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v0, 0x0

    .line 50
    if-gez p2, :cond_1

    .line 51
    .line 52
    iget-object p2, p0, Ln5/c$b;->a:Landroid/content/Context;

    .line 53
    .line 54
    const-string v1, "\u5207\u6362\u9ad8\u6e05\u6e05\u6670\u5ea6\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u91cd\u8bd5"

    .line 55
    .line 56
    invoke-static {p2, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget-object p2, p0, Ln5/c$b;->a:Landroid/content/Context;

    .line 65
    .line 66
    const-string v1, "\u6b63\u5728\u4e3a\u60a8\u5207\u6362\u4e3a\u9ad8\u6e05\u6e05\u6670\u5ea6\uff0c\u8bf7\u7a0d\u5019..."

    .line 67
    .line 68
    invoke-static {p2, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 76
    .line 77
    .line 78
    return-void
.end method
