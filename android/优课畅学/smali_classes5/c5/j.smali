.class public final synthetic Lc5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/compose/runtime/State;

.field public final synthetic b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic c:Lx7/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/State;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/j;->a:Landroidx/compose/runtime/State;

    iput-object p2, p0, Lc5/j;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iput-object p3, p0, Lc5/j;->c:Lx7/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc5/j;->a:Landroidx/compose/runtime/State;

    iget-object v1, p0, Lc5/j;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iget-object v2, p0, Lc5/j;->c:Lx7/p;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->g(Landroidx/compose/runtime/State;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;Landroidx/compose/foundation/lazy/LazyListScope;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
