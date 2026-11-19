.class public final synthetic Lc5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic b:Landroidx/compose/runtime/State;

.field public final synthetic c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic d:Lx7/p;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/compose/runtime/State;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/h;->a:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Lc5/h;->b:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lc5/h;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iput-object p4, p0, Lc5/h;->d:Lx7/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc5/h;->a:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Lc5/h;->b:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lc5/h;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iget-object v3, p0, Lc5/h;->d:Lx7/p;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/BoxScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->k(Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/compose/runtime/State;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
