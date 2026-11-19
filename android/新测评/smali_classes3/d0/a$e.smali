.class public Ld0/a$e;
.super Ljava/lang/Object;

# interfaces
.implements Ld0/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ld0/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ld0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld0/a$e;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ld0/a$e;->b:Ld0/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/a$e;->b:Ld0/c;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/sdk/android/logger/LogLevel;->a:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 4
    .line 5
    iget-object v2, p0, Ld0/a$e;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2, p1}, Ld0/c;->a(Lcom/alibaba/sdk/android/logger/LogLevel;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
