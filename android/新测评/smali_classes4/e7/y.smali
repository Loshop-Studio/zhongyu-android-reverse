.class public final synthetic Le7/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Landroidx/compose/runtime/State;

.field public final synthetic c:Landroidx/compose/runtime/State;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/y;->a:Ljava/util/List;

    iput-object p2, p0, Le7/y;->b:Landroidx/compose/runtime/State;

    iput-object p3, p0, Le7/y;->c:Landroidx/compose/runtime/State;

    iput-wide p4, p0, Le7/y;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Le7/y;->a:Ljava/util/List;

    iget-object v1, p0, Le7/y;->b:Landroidx/compose/runtime/State;

    iget-object v2, p0, Le7/y;->c:Landroidx/compose/runtime/State;

    iget-wide v3, p0, Le7/y;->d:J

    move-object v5, p1

    check-cast v5, Lorg/angmarch/views/NiceSpinner;

    invoke-static/range {v0 .. v5}, Le7/b0;->d(Ljava/util/List;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;JLorg/angmarch/views/NiceSpinner;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
