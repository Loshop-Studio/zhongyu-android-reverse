.class public final synthetic Ls5/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/navigation/NavArgumentBuilder;

    invoke-static {p1}, Lcom/zykj/evaluation/ui/MainFragment;->b1(Landroidx/navigation/NavArgumentBuilder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
