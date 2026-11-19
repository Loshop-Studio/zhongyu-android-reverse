.class public final synthetic Landroidx/room/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/b;->c:Ljava/util/List;

    iput p2, p0, Landroidx/room/b;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/b;->c:Ljava/util/List;

    iget v1, p0, Landroidx/room/b;->d:I

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Landroidx/room/AmbiguousColumnResolver;->a(Ljava/util/List;ILjava/util/List;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
