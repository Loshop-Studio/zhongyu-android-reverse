.class public final synthetic Lc2/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/s1;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/s1;->d:Ljava/lang/String;

    iput p3, p0, Lc2/s1;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc2/s1;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/s1;->d:Ljava/lang/String;

    iget v2, p0, Lc2/s1;->e:I

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/common/dao/ResourceDao_Impl;->n0(Ljava/lang/String;Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
