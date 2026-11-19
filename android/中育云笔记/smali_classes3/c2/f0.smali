.class public final synthetic Lc2/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc2/f0;->c:J

    iput-object p3, p0, Lc2/f0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, Lc2/f0;->c:J

    iget-object v2, p0, Lc2/f0;->d:Ljava/lang/String;

    check-cast p1, Landroidx/sqlite/SQLiteStatement;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/common/dao/FileDao_Impl;->k0(JLjava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
