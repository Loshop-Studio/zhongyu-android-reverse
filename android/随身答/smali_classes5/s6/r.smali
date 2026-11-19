.class public final synthetic Ls6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/r;->a:Ljava/util/List;

    iput-object p2, p0, Ls6/r;->b:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    iput-object p3, p0, Ls6/r;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/r;->a:Ljava/util/List;

    iget-object v1, p0, Ls6/r;->b:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    iget-object v2, p0, Ls6/r;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt;->g(Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/grid/LazyGridScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
