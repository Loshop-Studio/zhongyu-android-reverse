.class public abstract Lb7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static a:Lb7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lb7/a;-><init>(Lb7/a$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb7/a$b;->a:Lb7/a;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a()Lb7/a;
    .locals 1

    .line 1
    sget-object v0, Lb7/a$b;->a:Lb7/a;

    .line 2
    .line 3
    return-object v0
.end method
