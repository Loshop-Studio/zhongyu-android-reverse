.class public final synthetic Lcom/zykj/study/data/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/e0;->a:Ljava/lang/String;

    iput p2, p0, Lcom/zykj/study/data/e0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/e0;->a:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/study/data/e0;->b:I

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/data/CourseStudyKeyEntityDao_Impl;->a(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/CourseStudyKeyEntity;

    move-result-object p1

    return-object p1
.end method
