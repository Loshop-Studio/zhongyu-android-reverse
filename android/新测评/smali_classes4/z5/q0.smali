.class public final synthetic Lz5/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/q0;->a:Landroid/content/Context;

    iput-object p2, p0, Lz5/q0;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput p3, p0, Lz5/q0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz5/q0;->a:Landroid/content/Context;

    iget-object v1, p0, Lz5/q0;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget v2, p0, Lz5/q0;->c:I

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->x(Landroid/content/Context;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
