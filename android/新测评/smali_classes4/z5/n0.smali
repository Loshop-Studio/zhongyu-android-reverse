.class public final synthetic Lz5/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/n0;->a:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/n0;->a:Landroidx/navigation/NavController;

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->l(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
