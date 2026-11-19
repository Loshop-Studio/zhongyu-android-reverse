.class public final synthetic Lz5/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/w0;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/w0;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    invoke-static {v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->v(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
