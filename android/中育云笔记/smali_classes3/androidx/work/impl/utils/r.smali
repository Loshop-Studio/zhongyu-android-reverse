.class public final synthetic Landroidx/work/impl/utils/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/work/impl/utils/WorkProgressUpdater;

.field public final synthetic d:Ljava/util/UUID;

.field public final synthetic e:Landroidx/work/Data;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/utils/WorkProgressUpdater;Ljava/util/UUID;Landroidx/work/Data;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/utils/r;->c:Landroidx/work/impl/utils/WorkProgressUpdater;

    iput-object p2, p0, Landroidx/work/impl/utils/r;->d:Ljava/util/UUID;

    iput-object p3, p0, Landroidx/work/impl/utils/r;->e:Landroidx/work/Data;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/utils/r;->c:Landroidx/work/impl/utils/WorkProgressUpdater;

    iget-object v1, p0, Landroidx/work/impl/utils/r;->d:Ljava/util/UUID;

    iget-object v2, p0, Landroidx/work/impl/utils/r;->e:Landroidx/work/Data;

    invoke-static {v0, v1, v2}, Landroidx/work/impl/utils/WorkProgressUpdater;->a(Landroidx/work/impl/utils/WorkProgressUpdater;Ljava/util/UUID;Landroidx/work/Data;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
