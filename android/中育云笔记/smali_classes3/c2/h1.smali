.class public final synthetic Lc2/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/h1;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/h1;->d:Ljava/lang/String;

    iput-wide p3, p0, Lc2/h1;->e:J

    iput p5, p0, Lc2/h1;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc2/h1;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/h1;->d:Ljava/lang/String;

    iget-wide v2, p0, Lc2/h1;->e:J

    iget v4, p0, Lc2/h1;->f:I

    move-object v5, p1

    check-cast v5, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao_Impl;->x0(Ljava/lang/String;Ljava/lang/String;JILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
