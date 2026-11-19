# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class final Lcom/zykj/subscriber/MainActivity$b$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity$b;->open_html(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Ljava/lang/String;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$b$b;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$b$b;->a:Lcom/zykj/subscriber/MainActivity;

    sget v1, Lc2/u;->n:I

    invoke-virtual {v0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$b$b;->a(Ljava/lang/String;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
