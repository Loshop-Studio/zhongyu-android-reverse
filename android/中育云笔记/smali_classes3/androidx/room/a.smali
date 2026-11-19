.class public final synthetic Landroidx/room/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:[Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/a;->c:[Ljava/lang/String;

    iput-object p2, p0, Landroidx/room/a;->d:Ljava/util/List;

    iput p3, p0, Landroidx/room/a;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/room/a;->c:[Ljava/lang/String;

    iget-object v1, p0, Landroidx/room/a;->d:Ljava/util/List;

    iget v2, p0, Landroidx/room/a;->e:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, p3

    check-cast v5, Ljava/util/List;

    invoke-static/range {v0 .. v5}, Landroidx/room/AmbiguousColumnResolver;->b([Ljava/lang/String;Ljava/util/List;IIILjava/util/List;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
