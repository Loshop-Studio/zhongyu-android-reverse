.class final Lcom/zykj/subscriber/MainActivity$b$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity$b;->open_file(Ljava/lang/String;)V
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

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$b$a;->a:Lcom/zykj/subscriber/MainActivity;

    iput-object p2, p0, Lcom/zykj/subscriber/MainActivity$b$a;->b:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/zykj/subscriber/FileActivity;->e:Lcom/zykj/subscriber/FileActivity$a;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$b$a;->a:Lcom/zykj/subscriber/MainActivity;

    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity$b$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/zykj/subscriber/FileActivity$a;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$b$a;->a(Ljava/lang/String;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
