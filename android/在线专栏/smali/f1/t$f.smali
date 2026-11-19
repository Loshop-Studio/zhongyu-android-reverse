.class Lf1/t$f;
.super Lp0/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/t;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lf1/t;


# direct methods
.method constructor <init>(Lf1/t;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lf1/t$f;->d:Lf1/t;

    invoke-direct {p0, p2}, Lp0/l;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"

    return-object v0
.end method
