.class public final Lcom/zykj/blackboard/core/data/dao/AudioInfoEntityCursor$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/data/dao/AudioInfoEntityCursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)Lio/objectbox/Cursor;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntityCursor;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntityCursor;-><init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
