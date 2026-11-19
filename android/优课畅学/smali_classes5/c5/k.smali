.class public final synthetic Lc5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic a:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/k;->a:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc5/k;->a:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->l(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
