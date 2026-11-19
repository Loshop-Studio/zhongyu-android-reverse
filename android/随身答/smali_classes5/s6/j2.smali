.class public final synthetic Ls6/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Long;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZLjava/lang/Long;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/j2;->a:Ljava/util/List;

    iput-boolean p2, p0, Ls6/j2;->b:Z

    iput-object p3, p0, Ls6/j2;->c:Ljava/lang/Long;

    iput-object p4, p0, Ls6/j2;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ls6/j2;->a:Ljava/util/List;

    iget-boolean v1, p0, Ls6/j2;->b:Z

    iget-object v2, p0, Ls6/j2;->c:Ljava/lang/Long;

    iget-object v3, p0, Ls6/j2;->d:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->i(Ljava/util/List;ZLjava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
