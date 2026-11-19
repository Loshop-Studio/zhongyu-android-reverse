.class public final synthetic Lz5/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/e1;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/e1;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    check-cast p1, Lz5/t1;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->c(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lz5/t1;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
