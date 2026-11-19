.class public final synthetic Lc2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc2/i0;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-wide v0, p0, Lc2/i0;->c:J

    check-cast p1, Landroidx/sqlite/SQLiteStatement;

    invoke-static {v0, v1, p1}, Lcom/friday/common/dao/FileDao_Impl;->B0(JLandroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
