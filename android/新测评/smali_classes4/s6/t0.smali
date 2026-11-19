.class public final synthetic Ls6/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/t0;->a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/t0;->a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-static {v0}, Lcom/zykj/evaluation/ui/home/HomePageKt;->o(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
