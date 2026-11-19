.class public Ly8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;-><init>(Lz8/e;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;Ly8/h$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly8/e;


# direct methods
.method public constructor <init>(Ly8/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/e$b;->a:Ly8/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lz8/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/e$b;->a:Ly8/e;

    .line 2
    .line 3
    iget-object v0, v0, Ly8/e;->e:Ly8/h$a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ly8/h$a;->a(Lz8/c;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
