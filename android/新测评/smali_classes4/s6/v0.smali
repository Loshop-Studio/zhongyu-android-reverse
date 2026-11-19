.class public final synthetic Ls6/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/v0;->a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/v0;->a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    check-cast p1, Lcom/zykj/evaluation/ui/home/c;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/home/HomePageKt;->j(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
