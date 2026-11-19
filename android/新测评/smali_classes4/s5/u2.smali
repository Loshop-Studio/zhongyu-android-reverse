.class public final synthetic Ls5/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/MainFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/MainFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/u2;->a:Lcom/zykj/evaluation/ui/MainFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/u2;->a:Lcom/zykj/evaluation/ui/MainFragment;

    check-cast p1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/MainFragment;->x(Lcom/zykj/evaluation/ui/MainFragment;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
