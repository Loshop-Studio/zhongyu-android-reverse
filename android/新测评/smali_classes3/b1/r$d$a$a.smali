.class public Lb1/r$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/r$d$a;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lb1/r$d$a;


# direct methods
.method public constructor <init>(Lb1/r$d$a;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb1/r$d$a$a;->b:Lb1/r$d$a;

    .line 2
    .line 3
    iput-boolean p2, p0, Lb1/r$d$a$a;->a:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb1/r$d$a$a;->b:Lb1/r$d$a;

    .line 2
    .line 3
    iget-boolean v1, p0, Lb1/r$d$a$a;->a:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lb1/r$d$a;->a(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
