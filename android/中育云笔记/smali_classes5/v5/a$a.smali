.class public abstract Lv5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:Lv5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lv5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv5/a$a;->a:Lv5/a;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a()Lv5/a;
    .locals 1

    .line 1
    sget-object v0, Lv5/a$a;->a:Lv5/a;

    .line 2
    .line 3
    return-object v0
.end method
