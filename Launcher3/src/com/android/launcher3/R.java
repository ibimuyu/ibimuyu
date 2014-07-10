package com.android.launcher3;

/**
 * 需要手工将gen/R中的内容拷贝过来,好处是修改了apk的packageName但是不需要修改太多代码
 * @author ganggang
 *
 */
public final class R {
    public static final class anim {
        public static final int fade_in_fast=0x7f050000;
        public static final int fade_out_fast=0x7f050001;
    }
    public static final class array {
        public static final int wallpapers=0x7f0e0000;
    }
    public static final class attr {
        /**  The number of horizontal cells in the CellLayout 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cellCountX=0x7f010004;
        /**  The number of vertical cells in the CellLayout 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cellCountY=0x7f010005;
        /**  The height of a single cell 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cellHeight=0x7f010007;
        /**  The width of a single cell 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cellWidth=0x7f010006;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int className=0x7f010020;
        /**  The x index of the item to be focused in the cling 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int clingFocusedX=0x7f01001e;
        /**  The y index of the item to be focused in the cling 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int clingFocusedY=0x7f01001f;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int container=0x7f010022;
        /**  The first screen the workspace should display. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int defaultScreen=0x7f010003;
        /**  Used to identify how to draw the cling bg 
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int drawIdentifier=0x7f010001;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int heightGap=0x7f010009;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int icon=0x7f010028;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int key=0x7f01002b;
        /**  Max number of cells of applications horizontally 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int maxAppCellCountX=0x7f010018;
        /**  Max number of cells of applications vertically 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int maxAppCellCountY=0x7f010019;
        /**  The max gap size for each dimension 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int maxGap=0x7f01000a;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int packageName=0x7f010021;
        /**  The page indicator for this workspace 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int pageIndicator=0x7f010017;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageLayoutHeightGap=0x7f010011;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageLayoutPaddingBottom=0x7f010013;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageLayoutPaddingLeft=0x7f010014;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageLayoutPaddingRight=0x7f010015;
        /**  The padding of the pages that are dynamically created per page 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageLayoutPaddingTop=0x7f010012;
        /**  A spacing override for the icons within a page 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageLayoutWidthGap=0x7f010010;
        /**  The space between adjacent pages of the PagedView. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int pageSpacing=0x7f010016;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int screen=0x7f010023;
        /**  The source view to generate and apply the drawable states to/from 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int sourceImageViewId=0x7f01000e;
        /**  The source view to delegate touch presses events to. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int sourceViewId=0x7f010000;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int spanX=0x7f010026;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int spanY=0x7f010027;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int stateHotwordOn=0x7f01000f;
        /**  The color of the stroke outline 
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int strokeColor=0x7f01000b;
        /**  The color of the text 
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int strokeTextColor=0x7f01000c;
        /**  The width of the stroke 
         <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int strokeWidth=0x7f01000d;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int title=0x7f010029;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uri=0x7f01002a;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int value=0x7f01002c;
        /**  Vertical spacing between widgets 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int widgetCellHeightGap=0x7f01001b;
        /**  Horizontal spacing between widgets and wallpapers 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int widgetCellWidthGap=0x7f01001a;
        /**  Number of widgets horizontally 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int widgetCountX=0x7f01001c;
        /**  Number of widgets vertically 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int widgetCountY=0x7f01001d;
        /**  An override for the width and height gap to allow users to specify
             a specific size for the page using spacing instead of resolving the
             spacing from the width of the page 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int widthGap=0x7f010008;
        /**  Used to identify how to draw the cling bg 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int windowSize=0x7f010002;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int workspace=0x7f01002d;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int x=0x7f010024;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int y=0x7f010025;
    }
    public static final class bool {
        public static final int allow_rotation=0x7f080003;
        public static final int config_largeHeap=0x7f080000;
        /**  Whether or not to use custom clings if a custom workspace layout is passed in 
 Whether or not to use custom clings if a custom workspace layout is passed in 
         */
        public static final int config_useCustomClings=0x7f080006;
        /**  Workspace 
 Whether or not the drop targets drop down as opposed to fade in 
 Workspace 
 Whether or not the drop targets drop down as opposed to fade in 
 Workspace 
 Whether or not the drop targets drop down as opposed to fade in 
         */
        public static final int config_useDropTargetDownTransition=0x7f080004;
        /**  Whether or not to fade the side pages 
 Whether or not to fade the side pages 
 Workspace 
 Whether or not to fade the side pages 
 Whether or not to fade the side pages 
         */
        public static final int config_workspaceFadeAdjacentScreens=0x7f080005;
        /**  Memory debugging, including a memory dump icon 
         */
        public static final int debug_memory_enabled=0x7f080008;
        /**  Hotseat 
 Hotseat 
         */
        public static final int hotseat_transpose_layout_with_orientation=0x7f080007;
        public static final int is_large_tablet=0x7f080002;
        public static final int is_tablet=0x7f080001;
    }
    public static final class color {
        public static final int apps_customize_icon_text_color=0x7f070007;
        public static final int appwidget_error_color=0x7f070003;
        public static final int bubble_dark_background=0x7f070002;
        /**  The color tints to apply to the text and drag view when hovering
         over the delete target or the info target 
         */
        public static final int delete_target_hover_tint=0x7f070000;
        public static final int first_run_cling_circle_background_color=0x7f07000b;
        public static final int folder_items_text_color=0x7f070009;
        public static final int info_target_hover_tint=0x7f070001;
        public static final int outline_color=0x7f07000a;
        public static final int wallpaper_picker_translucent_gray=0x7f070008;
        public static final int workspace_all_apps_and_delete_zone_text_color=0x7f070004;
        public static final int workspace_all_apps_and_delete_zone_text_shadow_color=0x7f070005;
        public static final int workspace_icon_text_color=0x7f070006;
    }
    public static final class dimen {
        public static final int app_icon_size=0x7f0b0017;
        public static final int app_widget_preview_label_margin_left=0x7f0b0024;
        public static final int app_widget_preview_label_margin_right=0x7f0b0025;
        public static final int app_widget_preview_label_margin_top=0x7f0b0023;
        /**  Padding applied to AppWidget previews 
         */
        public static final int app_widget_preview_padding_left=0x7f0b0020;
        public static final int app_widget_preview_padding_right=0x7f0b0021;
        public static final int app_widget_preview_padding_top=0x7f0b0022;
        public static final int apps_customize_pageLayoutHeightGap=0x7f0b002d;
        public static final int apps_customize_pageLayoutPaddingBottom=0x7f0b002f;
        public static final int apps_customize_pageLayoutPaddingTop=0x7f0b002e;
        /**  AppsCustomize 
         */
        public static final int apps_customize_pageLayoutWidthGap=0x7f0b002c;
        /**  The AppsCustomize page indicator 
         */
        public static final int apps_customize_page_indicator_height=0x7f0b0018;
        public static final int apps_customize_page_indicator_margin=0x7f0b0019;
        public static final int apps_customize_page_indicator_offset=0x7f0b001a;
        /**  AllApps/Customize/AppsCustomize 
 The height of the tab bar - if this changes, we should update the
         external icon width/height above to compensate 
 AppsCustomize 
 AppsCustomize 
         */
        public static final int apps_customize_tab_bar_height=0x7f0b0015;
        public static final int apps_customize_tab_bar_margin_top=0x7f0b0016;
        /**  Cling 
         */
        public static final int clingPunchThroughGraphicCenterRadius=0x7f0b0007;
        /**  The offset for the text in the cling 
 Cling 
 The offset for the text in the cling 
 Cling 
 The offset for the text in the cling 
         */
        public static final int cling_text_block_offset_x=0x7f0b0009;
        public static final int cling_text_block_offset_y=0x7f0b000a;
        /**  When dragging items on the workspace, the number of dps by which the position of
     the drag view should be offset from the position of the original view. 
 When dragging items on the workspace, the number of dps by which the position of
     the drag view should be offset from the position of the original view. 
         */
        public static final int dragViewOffsetX=0x7f0b001d;
        public static final int dragViewOffsetY=0x7f0b001e;
        /**   When dragging an item, how much bigger (fixed dps) the dragged view
          should be. If 0, it will not be scaled at all. 
         */
        public static final int dragViewScale=0x7f0b001f;
        /**  Drag padding to add to the bottom of drop targets 
 Drag padding to add to the bottom of drop targets 
         */
        public static final int drop_target_drag_padding=0x7f0b001b;
        /**  Dynamic Grid 
         */
        public static final int dynamic_grid_edge_margin=0x7f0b0000;
        public static final int dynamic_grid_page_indicator_height=0x7f0b0003;
        public static final int dynamic_grid_search_bar_height=0x7f0b0002;
        public static final int dynamic_grid_search_bar_max_width=0x7f0b0001;
        /**  Clings 
 Clings 
         */
        public static final int folderClingMarginTop=0x7f0b0008;
        public static final int folder_name_padding=0x7f0b002a;
        /**  Folders 
 The amount that the preview contents are inset from the preview background 
         */
        public static final int folder_preview_padding=0x7f0b0029;
        public static final int overview_mode_page_offset=0x7f0b0010;
        public static final int overview_panel_bottom_padding=0x7f0b000e;
        public static final int overview_panel_buttonSpacing=0x7f0b000f;
        /**  Dragging 
 the area at the edge of the screen that makes the workspace go left
         or right while you're dragging. 
 the area at the edge of the screen that makes the workspace go left
         or right while you're dragging. 
 Workspace 
 the area at the edge of the screen that makes the workspace go left
         or right while you're dragging. 
         */
        public static final int scroll_zone=0x7f0b001c;
        /**  Padding applied to shortcut previews 
         */
        public static final int shortcut_preview_padding_left=0x7f0b0026;
        public static final int shortcut_preview_padding_right=0x7f0b0027;
        public static final int shortcut_preview_padding_top=0x7f0b0028;
        public static final int toolbar_button_horizontal_padding=0x7f0b0012;
        /**  QSB 
 QSB 
 QSB 
 QSB 
         */
        public static final int toolbar_button_vertical_padding=0x7f0b0011;
        public static final int toolbar_external_icon_height=0x7f0b0014;
        /**  External toolbar icon size (for bounds) 
         */
        public static final int toolbar_external_icon_width=0x7f0b0013;
        public static final int wallpaperItemIconSize=0x7f0b0006;
        public static final int wallpaperThumbnailHeight=0x7f0b0005;
        /**  Wallpaper picker 
         */
        public static final int wallpaperThumbnailWidth=0x7f0b0004;
        public static final int wallpaper_chooser_grid_height=0x7f0b0031;
        /**  dimensions for the wallpaper picker wallpaper thumbnail width 
         */
        public static final int wallpaper_chooser_grid_width=0x7f0b0030;
        /**  Workspace 
         */
        public static final int workspace_max_gap=0x7f0b000b;
        public static final int workspace_overscroll_drawable_padding=0x7f0b000c;
        /**  Workspace 
 We really want the page spacing to be the max of either the button bar
     height or the qsb bar height 
 Workspace 
 Workspace 
         */
        public static final int workspace_page_spacing=0x7f0b002b;
        public static final int workspace_spring_loaded_page_spacing=0x7f0b000d;
    }
    public static final class drawable {
        public static final int all_apps_button_icon=0x7f020000;
        public static final int apps_customize_bg=0x7f020001;
        public static final int arrow_dashed=0x7f020002;
        public static final int bg_appwidget_error=0x7f020003;
        public static final int bg_cling1=0x7f020004;
        public static final int bg_cling2=0x7f020005;
        public static final int bg_cling3=0x7f020006;
        public static final int bg_cling4=0x7f020007;
        public static final int bg_cling5=0x7f020008;
        public static final int bg_cling_home=0x7f020009;
        public static final int bg_cling_nakasi3=0x7f02000a;
        public static final int cling=0x7f02000b;
        public static final int cling_arrow_down=0x7f02000c;
        public static final int cling_arrow_end=0x7f02000d;
        public static final int cling_arrow_left=0x7f02000e;
        public static final int cling_arrow_right=0x7f02000f;
        public static final int cling_arrow_start=0x7f020010;
        public static final int cling_arrow_up=0x7f020011;
        public static final int cling_button=0x7f020012;
        public static final int cling_button_bg=0x7f020013;
        public static final int cling_button_pressed=0x7f020014;
        public static final int custom_content_page=0x7f020015;
        public static final int default_widget_preview_holo=0x7f020016;
        public static final int focusable_view_bg=0x7f020017;
        public static final int focused_bg=0x7f020018;
        public static final int hand=0x7f020019;
        public static final int home_press=0x7f02001a;
        public static final int homescreen_blue_normal_holo=0x7f02001b;
        public static final int homescreen_blue_strong_holo=0x7f02001c;
        public static final int hotseat_bg_panel=0x7f02001d;
        public static final int hotseat_scrubber_holo=0x7f02001e;
        public static final int hotseat_track_holo=0x7f02001f;
        public static final int ic_actionbar_accept=0x7f020020;
        public static final int ic_allapps=0x7f020021;
        public static final int ic_allapps_pressed=0x7f020022;
        public static final int ic_home_all_apps_holo_dark=0x7f020023;
        public static final int ic_home_google_logo_normal_holo=0x7f020024;
        public static final int ic_home_google_logo_pressed_holo=0x7f020025;
        public static final int ic_home_search_normal_holo=0x7f020026;
        public static final int ic_home_search_pressed_holo=0x7f020027;
        public static final int ic_home_voice_search_holo=0x7f020028;
        public static final int ic_home_voice_search_pressed_holo=0x7f020029;
        public static final int ic_images=0x7f02002a;
        public static final int ic_launcher_clear_active_holo=0x7f02002b;
        public static final int ic_launcher_clear_normal_holo=0x7f02002c;
        public static final int ic_launcher_info_active_holo=0x7f02002d;
        public static final int ic_launcher_info_normal_holo=0x7f02002e;
        public static final int ic_launcher_market_holo=0x7f02002f;
        public static final int ic_launcher_trashcan_active_holo=0x7f020030;
        public static final int ic_launcher_trashcan_normal_holo=0x7f020031;
        public static final int ic_pageindicator_add=0x7f020032;
        public static final int ic_pageindicator_current=0x7f020033;
        public static final int ic_pageindicator_default=0x7f020034;
        public static final int ic_qs_remote_display=0x7f020035;
        public static final int ic_qs_remote_display_connected=0x7f020036;
        public static final int ic_setting=0x7f020037;
        public static final int ic_setting_icn=0x7f020038;
        public static final int ic_setting_pressed=0x7f020039;
        public static final int ic_wallpaper=0x7f02003a;
        public static final int ic_wallpaper_pressed=0x7f02003b;
        public static final int ic_widget=0x7f02003c;
        public static final int ic_widget_pressed=0x7f02003d;
        public static final int info_target_selector=0x7f02003e;
        public static final int overscroll_glow_left=0x7f02003f;
        public static final int overscroll_glow_right=0x7f020040;
        public static final int page_hover_left_holo=0x7f020041;
        public static final int page_hover_right_holo=0x7f020042;
        public static final int paged_view_indicator=0x7f020043;
        public static final int portal_container_holo=0x7f020044;
        public static final int portal_ring_inner_holo=0x7f020045;
        public static final int portal_ring_inner_nolip_holo=0x7f020046;
        public static final int portal_ring_outer_holo=0x7f020047;
        public static final int portal_ring_rest=0x7f020048;
        public static final int remove_target_selector=0x7f020049;
        public static final int screenpanel=0x7f02004a;
        public static final int screenpanel_hover=0x7f02004b;
        public static final int search_bg_panel=0x7f02004c;
        public static final int search_frame=0x7f02004d;
        public static final int setting_button=0x7f02004e;
        public static final int tab_selected_focused_holo=0x7f02004f;
        public static final int tab_selected_holo=0x7f020050;
        public static final int tab_selected_pressed_focused_holo=0x7f020051;
        public static final int tab_selected_pressed_holo=0x7f020052;
        public static final int tab_unselected_focused_holo=0x7f020053;
        public static final int tab_unselected_holo=0x7f020054;
        public static final int tab_unselected_pressed_focused_holo=0x7f020055;
        public static final int tab_unselected_pressed_holo=0x7f020056;
        public static final int tab_widget_indicator_selector=0x7f020057;
        public static final int tile_picker_focused=0x7f020058;
        public static final int tile_picker_pressed=0x7f020059;
        public static final int tile_picker_selected=0x7f02005a;
        public static final int tile_shadow_bottom=0x7f02005b;
        public static final int tile_shadow_top=0x7f02005c;
        public static final int uninstall_target_selector=0x7f02005d;
        public static final int wallpaper_button=0x7f02005e;
        public static final int wallpaper_tile_fg=0x7f02005f;
        public static final int widget_button=0x7f020060;
        public static final int widget_container_holo=0x7f020061;
        public static final int widget_resize_frame_holo=0x7f020062;
        public static final int widget_resize_handle_bottom=0x7f020063;
        public static final int widget_resize_handle_left=0x7f020064;
        public static final int widget_resize_handle_right=0x7f020065;
        public static final int widget_resize_handle_top=0x7f020066;
        public static final int widget_tile=0x7f020067;
        public static final int workspace_bg=0x7f020068;
    }
    public static final class id {
        public static final int active=0x7f10000f;
        public static final int all_apps_cling_add_item=0x7f100001;
        public static final int all_apps_cling_title=0x7f100000;
        public static final int animation_buffer=0x7f100009;
        public static final int application_icon=0x7f100003;
        public static final int apps_customize_content=0x7f100004;
        public static final int apps_customize_pane=0x7f100027;
        public static final int apps_customize_pane_content=0x7f100007;
        public static final int apps_customize_progress_bar=0x7f10000a;
        public static final int bubble_content=0x7f100015;
        public static final int cling_dismiss=0x7f100002;
        public static final int cling_scrim=0x7f100023;
        public static final int content=0x7f100014;
        public static final int cropView=0x7f100036;
        public static final int custom_content_hint=0x7f100017;
        public static final int delete_target_text=0x7f100010;
        public static final int drag_layer=0x7f10001e;
        public static final int drag_target_bar=0x7f10002d;
        public static final int first_run_cling=0x7f100024;
        public static final int focused_hotseat_app_bubble=0x7f100041;
        public static final int focused_hotseat_app_description=0x7f100043;
        public static final int focused_hotseat_app_title=0x7f100042;
        public static final int folder_cling=0x7f100026;
        public static final int folder_cling_create_folder=0x7f100019;
        public static final int folder_cling_title=0x7f100018;
        public static final int folder_content=0x7f100034;
        public static final int folder_icon_name=0x7f10001b;
        public static final int folder_name=0x7f10002f;
        public static final int hotseat=0x7f100020;
        public static final int inactive=0x7f10000e;
        public static final int info_target_text=0x7f100011;
        public static final int label=0x7f10002e;
        public static final int launcher=0x7f10001d;
        public static final int layout=0x7f10001c;
        public static final int live_wallpaper_list=0x7f10003c;
        public static final int loading=0x7f100037;
        public static final int market_button=0x7f100006;
        public static final int master_wallpaper_list=0x7f10003a;
        public static final int menu_delete=0x7f100044;
        public static final int overview_panel=0x7f100022;
        public static final int page_indicator=0x7f100008;
        public static final int preview_background=0x7f10001a;
        public static final int provider=0x7f100013;
        public static final int provider_icon=0x7f100012;
        public static final int qsb_bar=0x7f100021;
        public static final int scroll_view=0x7f100033;
        public static final int search_bar_hint=0x7f100016;
        public static final int search_button=0x7f100030;
        public static final int search_button_container=0x7f100031;
        public static final int settings_button=0x7f10002c;
        public static final int tabs_container=0x7f100005;
        public static final int third_party_wallpaper_list=0x7f10003d;
        public static final int voice_button=0x7f100029;
        public static final int voice_button_container=0x7f100032;
        public static final int voice_button_proxy=0x7f100028;
        public static final int wallpaper_button=0x7f10002a;
        public static final int wallpaper_icon=0x7f100040;
        public static final int wallpaper_image=0x7f10003e;
        public static final int wallpaper_item_label=0x7f10003f;
        public static final int wallpaper_list=0x7f10003b;
        public static final int wallpaper_root=0x7f100035;
        public static final int wallpaper_scroll_container=0x7f100039;
        public static final int wallpaper_strip=0x7f100038;
        public static final int widget_button=0x7f10002b;
        public static final int widget_dims=0x7f10000d;
        public static final int widget_name=0x7f10000c;
        public static final int widget_preview=0x7f10000b;
        public static final int workspace=0x7f10001f;
        public static final int workspace_cling=0x7f100025;
    }
    public static final class integer {
        /**  AppsCustomize 
         */
        public static final int apps_customize_cling_focused_x=0x7f09001e;
        public static final int apps_customize_cling_focused_y=0x7f09001f;
        /**  AppsCustomize 
         */
        public static final int apps_customize_widget_cell_count_x=0x7f09001c;
        public static final int apps_customize_widget_cell_count_y=0x7f09001d;
        /**  The slope, in percent, of the drag movement needed to drag an item out of
         AppsCustomize (y / x * 100%)  
         */
        public static final int config_appsCustomizeDragSlopeThreshold=0x7f090011;
        public static final int config_appsCustomizeFadeInTime=0x7f09000a;
        public static final int config_appsCustomizeFadeOutTime=0x7f09000b;
        /**  AllApps/Customize/AppsCustomize 
 The alpha of the AppsCustomize bg in spring loaded mode 
         */
        public static final int config_appsCustomizeSpringLoadedBgAlpha=0x7f090002;
        public static final int config_appsCustomizeWorkspaceAnimationStagger=0x7f09000d;
        public static final int config_appsCustomizeWorkspaceShrinkTime=0x7f09000c;
        /**  Fade/zoom in/out duration & scale in the AllApps transition.
         Note: This should be less than the workspaceShrinkTime as they happen together. 
         */
        public static final int config_appsCustomizeZoomInTime=0x7f090007;
        public static final int config_appsCustomizeZoomOutTime=0x7f090008;
        public static final int config_appsCustomizeZoomScaleFactor=0x7f090009;
        /**  Camera distance for the overscroll effect 
 Camera distance for the overscroll effect. We use a higher value here because the 
         workspace screens run nearly flush to the edge of the screen
 Camera distance for the overscroll effect 
         */
        public static final int config_cameraDistance=0x7f09001b;
        /**  Properties controlling the workspace fade-out during dragging 
         */
        public static final int config_dragFadeOutAlpha=0x7f090019;
        public static final int config_dragFadeOutDuration=0x7f09001a;
        /**  The duration (in ms) of the fade animation on the object outlines, used when
         we are dragging objects around on the home screen. 
         */
        public static final int config_dragOutlineFadeTime=0x7f090013;
        /**  The alpha value at which to show the most recent drop visualization outline. 
         */
        public static final int config_dragOutlineMaxAlpha=0x7f090014;
        /**  The distance at which the animation should take the max duration 
         */
        public static final int config_dropAnimMaxDist=0x7f090018;
        public static final int config_dropAnimMaxDuration=0x7f090016;
        /**  Parameters controlling the animation for when an item is dropped on the home screen,
         and it animates from its old position to the new one. 
         */
        public static final int config_dropAnimMinDuration=0x7f090015;
        /**  The transition duration for the background of the drop targets 
         */
        public static final int config_dropTargetBgTransitionDuration=0x7f090012;
        /**  DragController 
 DragController 
         */
        public static final int config_flingToDeleteMinVelocity=0x7f090001;
        /**  The duration of the UserFolder opening and closing animation 
         */
        public static final int config_folderAnimDuration=0x7f090017;
        /**  Max number of page indicators to show 
         */
        public static final int config_maxNumberOfPageIndicatorsToShow=0x7f090000;
        public static final int config_overviewTransitionTime=0x7f090004;
        /**  Tab transition animation duration 
         */
        public static final int config_tabTransitionDuration=0x7f090010;
        public static final int config_workspaceAppsCustomizeAnimationStagger=0x7f09000e;
        public static final int config_workspaceDefaultScreen=0x7f09000f;
        /**  Out of 100, the percent to shrink the workspace during overview mode. 
         */
        public static final int config_workspaceOverviewShrinkPercentage=0x7f090006;
        /**  Out of 100, the percent to shrink the workspace during spring loaded mode. 
 AllApps/Customize/AppsCustomize 
 Out of 100, the percent to shrink the workspace during spring loaded mode. 
         */
        public static final int config_workspaceSpringLoadShrinkPercentage=0x7f090005;
        public static final int config_workspaceUnshrinkTime=0x7f090003;
    }
    public static final class layout {
        public static final int actionbar_set_wallpaper=0x7f040000;
        public static final int add_list_item=0x7f040001;
        public static final int all_apps_button=0x7f040002;
        public static final int all_apps_cling=0x7f040003;
        public static final int application=0x7f040004;
        public static final int apps_customize_application=0x7f040005;
        public static final int apps_customize_pane=0x7f040006;
        public static final int apps_customize_progressbar=0x7f040007;
        public static final int apps_customize_widget=0x7f040008;
        public static final int appwidget_error=0x7f040009;
        public static final int custom_content_page_indicator_marker=0x7f04000a;
        public static final int custom_workspace_cling=0x7f04000b;
        public static final int drop_target_bar=0x7f04000c;
        public static final int external_widget_drop_list_item=0x7f04000d;
        public static final int first_run_cling=0x7f04000e;
        public static final int folder_cling=0x7f04000f;
        public static final int folder_icon=0x7f040010;
        public static final int hotseat=0x7f040011;
        public static final int launcher=0x7f040012;
        public static final int market_button=0x7f040013;
        public static final int overview_panel=0x7f040014;
        public static final int page_indicator=0x7f040015;
        public static final int page_indicator_marker=0x7f040016;
        public static final int qsb_bar=0x7f040017;
        public static final int rename_folder=0x7f040018;
        public static final int search_bar=0x7f040019;
        public static final int tab_widget_indicator=0x7f04001a;
        public static final int user_folder=0x7f04001b;
        public static final int wallpaper_cropper=0x7f04001c;
        public static final int wallpaper_picker=0x7f04001d;
        public static final int wallpaper_picker_image_picker_item=0x7f04001e;
        public static final int wallpaper_picker_item=0x7f04001f;
        public static final int wallpaper_picker_live_wallpaper_item=0x7f040020;
        public static final int wallpaper_picker_third_party_item=0x7f040021;
        public static final int workspace_cling=0x7f040022;
        public static final int workspace_screen=0x7f040023;
    }
    public static final class menu {
        public static final int cab_delete_wallpapers=0x7f0f0000;
    }
    public static final class mipmap {
        public static final int ic_launcher_application=0x7f030000;
        public static final int ic_launcher_home=0x7f030001;
        public static final int ic_launcher_wallpaper=0x7f030002;
    }
    public static final class plurals {
        /**  Shown when wallpapers are selected in Wallpaper picker 
 String indicating how many media item(s) is(are) selected
            eg. 1 selected [CHAR LIMIT=30] 
         */
        public static final int number_of_items_selected=0x7f0c0000;
    }
    public static final class string {
        /**  Accessibility: AllApps button 
         */
        public static final int accessibility_all_apps_button=0x7f0a0030;
        /**  Accessibility: Delete button 
         */
        public static final int accessibility_delete_button=0x7f0a0031;
        /**  Accessibility: Search button 
         */
        public static final int accessibility_search_button=0x7f0a002e;
        /**  Accessibility: Voice Search button 
         */
        public static final int accessibility_voice_search_button=0x7f0a002f;
        /**  Displayed when user selects a shortcut for an app that was uninstalled [CHAR_LIMIT=none]
         */
        public static final int activity_not_found=0x7f0a000c;
        /**  All applications label 
         */
        public static final int all_apps_button_label=0x7f0a0027;
        /**  The description of how to pick up and add an item to the workspace [CHAR_LIMIT=160] 
         */
        public static final int all_apps_cling_add_item=0x7f0a0053;
        /**  The title text for the All Apps cling [CHAR_LIMIT=60] 
         */
        public static final int all_apps_cling_title=0x7f0a0052;
        /**  Label for button in all applications label to go back home (to the workspace / desktop)
         for accessibilty (spoken when the button gets focus). 
         */
        public static final int all_apps_home_button_label=0x7f0a0028;
        /**  Accessibility string used to announce that a wallpaper has been selected. 
         */
        public static final int announce_selection=0x7f0a0007;
        /**  Name of a subclass of com.android.launcher3.AppFilter used to
         filter the activities shown in the launcher. Can be empty. 
         */
        public static final int app_filter_class=0x7f0a0000;
        /**  Application name 
         */
        public static final int application_name=0x7f0a0001;
        /**  The format string for AppsCustomize Apps page scroll text [CHAR_LIMIT=none] 
         */
        public static final int apps_customize_apps_scroll_format=0x7f0a0049;
        /**  The format string for AppsCustomize Apps page scroll text [CHAR_LIMIT=none] 
         */
        public static final int apps_customize_widgets_scroll_format=0x7f0a004a;
        /**  Appears in the CAB when an app is selected in All Apps or Customize mode. [CHAR_LIMIT=50] 
         */
        public static final int cab_app_selection_text=0x7f0a0036;
        /**  Appears in the CAB when a folder is selected in Customize mode. [CHAR_LIMIT=50] 
         */
        public static final int cab_folder_selection_text=0x7f0a0038;
        /**  Describes the button for getting details/info about currently selected application.
         Text is not displayed, but provided for accessibility. [CHAR_LIMIT=none] 
         */
        public static final int cab_menu_app_info=0x7f0a0035;
        /**  Describes the button for uninstalling the currently selected application.
         Text is not displayed, but provided for accessibility. [CHAR_LIMIT=none] 
         */
        public static final int cab_menu_delete_app=0x7f0a0034;
        /**  Appears in the CAB when a shortcut is selected in Customize mode. [CHAR_LIMIT=50] 
         */
        public static final int cab_shortcut_selection_text=0x7f0a0039;
        /**  Appears in the CAB when a widget is selected in Customize mode. [CHAR_LIMIT=50] 
         */
        public static final int cab_widget_selection_text=0x7f0a0037;
        /**  Buttons in Rename folder dialog box 
         */
        public static final int cancel_action=0x7f0a0019;
        public static final int chooser_wallpaper=0x7f0a0066;
        /**  The text on the button to dismiss a cling [CHAR_LIMIT=30] 
         */
        public static final int cling_dismiss=0x7f0a0056;
        /**  Error message when user has filled all their home screens 
         */
        public static final int completely_out_of_space=0x7f0a001e;
        /**  Title of activity for cropping wallpapers 
         */
        public static final int crop_wallpaper=0x7f0a000b;
        /**  Dummy string [CHAR_LIMIT=60] 
         */
        public static final int custom_workspace_cling_description_1=0x7f0a005f;
        /**  Dummy string [CHAR_LIMIT=60] 
         */
        public static final int custom_workspace_cling_description_2=0x7f0a0061;
        /**  Strings used in device overlays 
 Clings 
 Dummy string [CHAR_LIMIT=40] 
         */
        public static final int custom_workspace_cling_title_1=0x7f0a005e;
        /**  Dummy string [CHAR_LIMIT=40] 
         */
        public static final int custom_workspace_cling_title_2=0x7f0a0060;
        /**  Debug-only activity name. [DO NOT TRANSLATE] 
         */
        public static final int debug_memory_activity=0x7f0a0062;
        /**  The format string for default page scroll text [CHAR_LIMIT=none] 
         */
        public static final int default_scroll_format=0x7f0a0047;
        /**  Label for delete drop target. [CHAR_LIMIT=30] 
         */
        public static final int delete_target_label=0x7f0a002b;
        /**  Label for uninstall drop target. [CHAR_LIMIT=30]
         */
        public static final int delete_target_uninstall_label=0x7f0a002c;
        /**  Label for trash icon in All Apps. The icon/widget will become completely unavailable on the
         device. [CHAR_LIMIT=30]
         */
        public static final int delete_zone_label_all_apps=0x7f0a002a;
        /**  Label for trash icon in All Apps, when an updated system app is selected. The update will
         be uninstalled. [CHAR_LIMIT=30] 
         */
        public static final int delete_zone_label_all_apps_system_app=0x7f0a0032;
        /**  Label for trash icon on workspace. Meant to communicate the idea of removing the
         icon/widget from the home screen, but not permanently. [CHAR_LIMIT=30] 
         */
        public static final int delete_zone_label_workspace=0x7f0a0029;
        /**  Title of the Android Dreams (screensaver) module 
         */
        public static final int dream_name=0x7f0a0044;
        /**  Error message on dummy custom cling layout [DO NOT TRANSLATE] 
         */
        public static final int dummy_custom_cling_error_message=0x7f0a0057;
        /**  External-drop widget error string.  This is the error that is shown
         when you drag and item into the homescreen and it is unable to fit,
         or an error is encountered. [CHAR_LIMIT=50] 
         */
        public static final int external_drop_widget_error=0x7f0a0014;
        /**  External-drop widget pick label format string [CHAR_LIMIT=25] 
         */
        public static final int external_drop_widget_pick_format=0x7f0a0013;
        /**  External-drop widget pick title.  This is shown as the title of the
         dialog which allows you to pick which widgets to handle a particular
         drop if there are multiple choices. [CHAR_LIMIT=35] 
         */
        public static final int external_drop_widget_pick_title=0x7f0a0015;
        /**  The description of how to use the workspace [CHAR_LIMIT=60] 
         */
        public static final int first_run_cling_create_screens_hint=0x7f0a004f;
        /**  The description of how to use the workspace [CHAR_LIMIT=60] 
         */
        public static final int first_run_cling_custom_content_hint=0x7f0a004d;
        /**  The description of how to use the workspace [CHAR_LIMIT=60] 
         */
        public static final int first_run_cling_description=0x7f0a004c;
        /**  The description of how to use the workspace [CHAR_LIMIT=60] 
         */
        public static final int first_run_cling_search_bar_hint=0x7f0a004e;
        /**  Clings 
 The title text for the workspace cling [CHAR_LIMIT=60] 
         */
        public static final int first_run_cling_title=0x7f0a004b;
        /**  The description of how to create a folder [CHAR_LIMIT=160] 
         */
        public static final int folder_cling_create_folder=0x7f0a0055;
        public static final int folder_cling_move_item=0x7f0a0070;
        /**  The title text for the Folder cling [CHAR_LIMIT=60] 
         */
        public static final int folder_cling_title=0x7f0a0054;
        /**  Indication that folder closed 
         */
        public static final int folder_closed=0x7f0a005b;
        /**  Default folder title 
         */
        public static final int folder_hint_text=0x7f0a0045;
        /**  Default folder name 
         */
        public static final int folder_name=0x7f0a0004;
        /**  Folder name format 
         */
        public static final int folder_name_format=0x7f0a005d;
        /**  Folder accessibility 
 The format string for when a folder is opened, speaks the dimensions 
         */
        public static final int folder_opened=0x7f0a0058;
        /**  Folder renamed format 
         */
        public static final int folder_renamed=0x7f0a005c;
        /**  Instruction that clicking outside will close folder 
         */
        public static final int folder_tap_to_close=0x7f0a0059;
        /**  Instruction that clicking outside will commit folder rename 
         */
        public static final int folder_tap_to_rename=0x7f0a005a;
        /**  Text to show user in place of a gadget when we can't display it properly 
         */
        public static final int gadget_error_text=0x7f0a0042;
        /**  Options in "Add to Home" dialog box; Title of the group containing the list of all apps 
         */
        public static final int group_applications=0x7f0a001b;
        /**  Options in "Add to Home" dialog box; Title of the group containing the list of all shortcut
s 
         */
        public static final int group_shortcuts=0x7f0a001c;
        public static final int group_wallpapers=0x7f0a0067;
        /**  Options in "Add to Home" dialog box; Title of the group containing the list of all widgets/gadgets 
         */
        public static final int group_widgets=0x7f0a001d;
        /**  URL pointing to help text. If empty, no link to help will be created [DO NOT TRANSLATE] 
         */
        public static final int help_url=0x7f0a0033;
        /**  Accessibility-facing application name 
         */
        public static final int home=0x7f0a0002;
        /**  Error message when user has filled the hotseat 
         */
        public static final int hotseat_out_of_space=0x7f0a0020;
        /**  Label for the info icon. [CHAR_LIMIT=30] 
         */
        public static final int info_target_label=0x7f0a002d;
        /**  Error message when user tries to drop an invalid item on the hotseat 
         */
        public static final int invalid_hotseat_item=0x7f0a0021;
        /**  AppsCustomize pane 
 Message to tell the user to press and hold on a widget to add it [CHAR_LIMIT=50] 
         */
        public static final int long_press_widget_to_add=0x7f0a0010;
        /**  Market button text.  The market button text is removed in Launcher.java 
         in the Phone UI. [CHAR LIMIT=32] 
         */
        public static final int market=0x7f0a0011;
        public static final int menu_add=0x7f0a0068;
        public static final int menu_help=0x7f0a006e;
        /**  Title of dialog box 
         */
        public static final int menu_item_add_item=0x7f0a001a;
        public static final int menu_manage_apps=0x7f0a0069;
        public static final int menu_notifications=0x7f0a006c;
        public static final int menu_search=0x7f0a006b;
        public static final int menu_settings=0x7f0a006d;
        public static final int menu_wallpaper=0x7f0a006a;
        /**  Error message when user has filled a home screen 
         */
        public static final int out_of_space=0x7f0a001f;
        /**  Permission description 
         */
        public static final int permdesc_install_shortcut=0x7f0a003b;
        /**  Permission description 
         */
        public static final int permdesc_read_settings=0x7f0a003f;
        /**  Permission description 
         */
        public static final int permdesc_uninstall_shortcut=0x7f0a003d;
        /**  Permission description 
         */
        public static final int permdesc_write_settings=0x7f0a0041;
        /**  Permission short label 
         */
        public static final int permlab_install_shortcut=0x7f0a003a;
        /**  Permission short label 
         */
        public static final int permlab_read_settings=0x7f0a003e;
        /**  Permission short label 
         */
        public static final int permlab_uninstall_shortcut=0x7f0a003c;
        /**  Permission short label 
         */
        public static final int permlab_write_settings=0x7f0a0040;
        /**  Label on button in Wallpaper Picker to pick an image 
         */
        public static final int pick_image=0x7f0a0009;
        /**  Option in "Select wallpaper from" dialog box 
         */
        public static final int pick_wallpaper=0x7f0a000a;
        /**  Buttons in Rename folder dialog box 
         */
        public static final int rename_action=0x7f0a0018;
        /**  Label of Folder name field in Rename folder dialog box 
         */
        public static final int rename_folder_label=0x7f0a0016;
        /**  Title of dialog box 
         */
        public static final int rename_folder_title=0x7f0a0017;
        /**  Text for settings button 
         */
        public static final int settings_button_text=0x7f0a0065;
        /**  Message displayed when an external application attemps to create a shortcut that already exists 
         */
        public static final int shortcut_duplicate=0x7f0a0024;
        /**  Message displayed when a shortcut is created by an external application 
         */
        public static final int shortcut_installed=0x7f0a0022;
        /**  Message displayed when a shortcut is uninstalled by an external application 
         */
        public static final int shortcut_uninstalled=0x7f0a0023;
        /**  Title of dialog when user is selecting an application to add to homescreen 
         */
        public static final int title_select_application=0x7f0a0026;
        /**  Title of dialog when user is selecting shortcut to add to homescreen 
         */
        public static final int title_select_shortcut=0x7f0a0025;
        public static final int toggle_weight_watcher=0x7f0a000f;
        /**  Name for all applications running as this uid. 
         */
        public static final int uid_name=0x7f0a0003;
        /**  Text to inform the user that they can't uninstall a system application 
         */
        public static final int uninstall_system_app_text=0x7f0a0043;
        /**  Accessibility string used as a label for a particular wallpaper in the Wallpaper Picker list.
         e.g. "Wallpaper 3 of 10" 
         */
        public static final int wallpaper_accessibility_name=0x7f0a0006;
        /**  Text for wallpaper change button 
         */
        public static final int wallpaper_button_text=0x7f0a0064;
        /**  Label on button to delete wallpaper(s) 
         */
        public static final int wallpaper_delete=0x7f0a0008;
        /**  Button label on Wallpaper picker screen; user selects this button to set a specific wallpaper 
         */
        public static final int wallpaper_instructions=0x7f0a0005;
        public static final int widget_adder=0x7f0a000e;
        /**  Strings for the customization mode 
 Text for widget add button 
         */
        public static final int widget_button_text=0x7f0a0063;
        /**  The format string for the dimensions of a widget in the drawer 
 There is a special version of this format string for Farsi 
         */
        public static final int widget_dims_format=0x7f0a0012;
        /**   Labels for the tabs in the customize drawer 
         */
        public static final int widgets_tab_label=0x7f0a000d;
        /**  The description of how to use the workspace [CHAR_LIMIT=160] 
         */
        public static final int workspace_cling_move_item=0x7f0a0051;
        public static final int workspace_cling_open_all_apps=0x7f0a006f;
        /**  The title text for the workspace cling [CHAR_LIMIT=60] 
         */
        public static final int workspace_cling_title=0x7f0a0050;
        /**  The format string for Workspace descriptions [CHAR_LIMIT=none] 
         */
        public static final int workspace_description_format=0x7f0a0046;
        /**  The format string for Workspace page scroll text [CHAR_LIMIT=none] 
         */
        public static final int workspace_scroll_format=0x7f0a0048;
    }
    public static final class style {
        public static final int ClingAltTitleText=0x7f0d0005;
        /**  Clings 
         */
        public static final int ClingButton=0x7f0d0003;
        public static final int ClingHintText=0x7f0d0007;
        public static final int ClingText=0x7f0d0006;
        public static final int ClingTitleText=0x7f0d0004;
        public static final int CustomClingText=0x7f0d0015;
        /**  Overridden in device overlays 
         */
        public static final int CustomClingTitleText=0x7f0d0014;
        public static final int DropTargetButton=0x7f0d0010;
        public static final int DropTargetButtonContainer=0x7f0d000f;
        public static final int MarketButton=0x7f0d0013;
        /**  Search Bar 
 QSB Search / Drop Target bar 
         */
        public static final int QSBBar=0x7f0d000c;
        /**  Workspace 
         */
        public static final int SearchButton=0x7f0d000e;
        public static final int SearchDropTargetBar=0x7f0d000d;
        public static final int TabIndicator=0x7f0d0011;
        /**  Overridden in values-land 
 AppsCustomize 
 AppsCustomize 
 AppsCustomize 
         */
        public static final int TabIndicator_AppsCustomize=0x7f0d0012;
        /**  Workspace 
         */
        public static final int Theme=0x7f0d0002;
        public static final int Theme_WallpaperCropper=0x7f0d0000;
        public static final int WallpaperCropperActionBar=0x7f0d0001;
        public static final int WorkspaceIcon=0x7f0d0008;
        public static final int WorkspaceIcon_AppsCustomize=0x7f0d000b;
        public static final int WorkspaceIcon_Landscape=0x7f0d000a;
        public static final int WorkspaceIcon_Portrait=0x7f0d0009;
    }
    public static final class xml {
        public static final int default_workspace=0x7f060000;
        public static final int update_workspace=0x7f060001;
    }
    public static final class styleable {
        /**  AppsCustomizePagedView specific attributes.  These attributes are used to
         customize an AppsCustomizePagedView in xml files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_clingFocusedX com.ibimuyu.android.launcher3:clingFocusedX}</code></td><td> The x index of the item to be focused in the cling </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_clingFocusedY com.ibimuyu.android.launcher3:clingFocusedY}</code></td><td> The y index of the item to be focused in the cling </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_maxAppCellCountX com.ibimuyu.android.launcher3:maxAppCellCountX}</code></td><td> Max number of cells of applications horizontally </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_maxAppCellCountY com.ibimuyu.android.launcher3:maxAppCellCountY}</code></td><td> Max number of cells of applications vertically </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_widgetCellHeightGap com.ibimuyu.android.launcher3:widgetCellHeightGap}</code></td><td> Vertical spacing between widgets </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_widgetCellWidthGap com.ibimuyu.android.launcher3:widgetCellWidthGap}</code></td><td> Horizontal spacing between widgets and wallpapers </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_widgetCountX com.ibimuyu.android.launcher3:widgetCountX}</code></td><td> Number of widgets horizontally </td></tr>
           <tr><td><code>{@link #AppsCustomizePagedView_widgetCountY com.ibimuyu.android.launcher3:widgetCountY}</code></td><td> Number of widgets vertically </td></tr>
           </table>
           @see #AppsCustomizePagedView_clingFocusedX
           @see #AppsCustomizePagedView_clingFocusedY
           @see #AppsCustomizePagedView_maxAppCellCountX
           @see #AppsCustomizePagedView_maxAppCellCountY
           @see #AppsCustomizePagedView_widgetCellHeightGap
           @see #AppsCustomizePagedView_widgetCellWidthGap
           @see #AppsCustomizePagedView_widgetCountX
           @see #AppsCustomizePagedView_widgetCountY
         */
        public static final int[] AppsCustomizePagedView = {
            0x7f010018, 0x7f010019, 0x7f01001a, 0x7f01001b,
            0x7f01001c, 0x7f01001d, 0x7f01001e, 0x7f01001f
        };
        /**
          <p>
          @attr description
           The x index of the item to be focused in the cling 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:clingFocusedX
        */
        public static final int AppsCustomizePagedView_clingFocusedX = 6;
        /**
          <p>
          @attr description
           The y index of the item to be focused in the cling 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:clingFocusedY
        */
        public static final int AppsCustomizePagedView_clingFocusedY = 7;
        /**
          <p>
          @attr description
           Max number of cells of applications horizontally 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:maxAppCellCountX
        */
        public static final int AppsCustomizePagedView_maxAppCellCountX = 0;
        /**
          <p>
          @attr description
           Max number of cells of applications vertically 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:maxAppCellCountY
        */
        public static final int AppsCustomizePagedView_maxAppCellCountY = 1;
        /**
          <p>
          @attr description
           Vertical spacing between widgets 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:widgetCellHeightGap
        */
        public static final int AppsCustomizePagedView_widgetCellHeightGap = 3;
        /**
          <p>
          @attr description
           Horizontal spacing between widgets and wallpapers 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:widgetCellWidthGap
        */
        public static final int AppsCustomizePagedView_widgetCellWidthGap = 2;
        /**
          <p>
          @attr description
           Number of widgets horizontally 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:widgetCountX
        */
        public static final int AppsCustomizePagedView_widgetCountX = 4;
        /**
          <p>
          @attr description
           Number of widgets vertically 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:widgetCountY
        */
        public static final int AppsCustomizePagedView_widgetCountY = 5;
        /**  CellLayout specific attributes. These attributes are used to customize
         a CellLayout view in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #CellLayout_cellHeight com.ibimuyu.android.launcher3:cellHeight}</code></td><td> The height of a single cell </td></tr>
           <tr><td><code>{@link #CellLayout_cellWidth com.ibimuyu.android.launcher3:cellWidth}</code></td><td> The width of a single cell </td></tr>
           <tr><td><code>{@link #CellLayout_heightGap com.ibimuyu.android.launcher3:heightGap}</code></td><td></td></tr>
           <tr><td><code>{@link #CellLayout_maxGap com.ibimuyu.android.launcher3:maxGap}</code></td><td> The max gap size for each dimension </td></tr>
           <tr><td><code>{@link #CellLayout_widthGap com.ibimuyu.android.launcher3:widthGap}</code></td><td> An override for the width and height gap to allow users to specify
             a specific size for the page using spacing instead of resolving the
             spacing from the width of the page </td></tr>
           </table>
           @see #CellLayout_cellHeight
           @see #CellLayout_cellWidth
           @see #CellLayout_heightGap
           @see #CellLayout_maxGap
           @see #CellLayout_widthGap
         */
        public static final int[] CellLayout = {
            0x7f010006, 0x7f010007, 0x7f010008, 0x7f010009,
            0x7f01000a
        };
        /**
          <p>
          @attr description
           The height of a single cell 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:cellHeight
        */
        public static final int CellLayout_cellHeight = 1;
        /**
          <p>
          @attr description
           The width of a single cell 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:cellWidth
        */
        public static final int CellLayout_cellWidth = 0;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#heightGap}
          attribute's value can be found in the {@link #CellLayout} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:heightGap
        */
        public static final int CellLayout_heightGap = 3;
        /**
          <p>
          @attr description
           The max gap size for each dimension 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:maxGap
        */
        public static final int CellLayout_maxGap = 4;
        /**
          <p>
          @attr description
           An override for the width and height gap to allow users to specify
             a specific size for the page using spacing instead of resolving the
             spacing from the width of the page 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:widthGap
        */
        public static final int CellLayout_widthGap = 2;
        /**  Cling specific attributes. These attributes are used to customize
         the cling in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #Cling_drawIdentifier com.ibimuyu.android.launcher3:drawIdentifier}</code></td><td> Used to identify how to draw the cling bg </td></tr>
           </table>
           @see #Cling_drawIdentifier
         */
        public static final int[] Cling = {
            0x7f010001
        };
        /**
          <p>
          @attr description
           Used to identify how to draw the cling bg 


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:drawIdentifier
        */
        public static final int Cling_drawIdentifier = 0;
        /** Attributes that can be used with a CustomClingText.
         */
        public static final int[] CustomClingText = {
            
        };
        /**  Only used in the device overlays 
         */
        public static final int[] CustomClingTitleText = {
            
        };
        /**  DrawableStateProxyView specific attributes. These attributes are used to customize
         a DrawableStateProxyView view in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #DrawableStateProxyView_sourceViewId com.ibimuyu.android.launcher3:sourceViewId}</code></td><td> The source view to delegate touch presses events to.</td></tr>
           </table>
           @see #DrawableStateProxyView_sourceViewId
         */
        public static final int[] DrawableStateProxyView = {
            0x7f010000
        };
        /**
          <p>
          @attr description
           The source view to delegate touch presses events to. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:sourceViewId
        */
        public static final int DrawableStateProxyView_sourceViewId = 0;
        /** Attributes that can be used with a Extra.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #Extra_key com.ibimuyu.android.launcher3:key}</code></td><td></td></tr>
           <tr><td><code>{@link #Extra_value com.ibimuyu.android.launcher3:value}</code></td><td></td></tr>
           </table>
           @see #Extra_key
           @see #Extra_value
         */
        public static final int[] Extra = {
            0x7f01002b, 0x7f01002c
        };
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#key}
          attribute's value can be found in the {@link #Extra} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:key
        */
        public static final int Extra_key = 0;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#value}
          attribute's value can be found in the {@link #Extra} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:value
        */
        public static final int Extra_value = 1;
        /**  XML attributes used by default_workspace.xml 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #Favorite_className com.ibimuyu.android.launcher3:className}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_container com.ibimuyu.android.launcher3:container}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_icon com.ibimuyu.android.launcher3:icon}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_packageName com.ibimuyu.android.launcher3:packageName}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_screen com.ibimuyu.android.launcher3:screen}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_spanX com.ibimuyu.android.launcher3:spanX}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_spanY com.ibimuyu.android.launcher3:spanY}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_title com.ibimuyu.android.launcher3:title}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_uri com.ibimuyu.android.launcher3:uri}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_x com.ibimuyu.android.launcher3:x}</code></td><td></td></tr>
           <tr><td><code>{@link #Favorite_y com.ibimuyu.android.launcher3:y}</code></td><td></td></tr>
           </table>
           @see #Favorite_className
           @see #Favorite_container
           @see #Favorite_icon
           @see #Favorite_packageName
           @see #Favorite_screen
           @see #Favorite_spanX
           @see #Favorite_spanY
           @see #Favorite_title
           @see #Favorite_uri
           @see #Favorite_x
           @see #Favorite_y
         */
        public static final int[] Favorite = {
            0x7f010020, 0x7f010021, 0x7f010022, 0x7f010023,
            0x7f010024, 0x7f010025, 0x7f010026, 0x7f010027,
            0x7f010028, 0x7f010029, 0x7f01002a
        };
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#className}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:className
        */
        public static final int Favorite_className = 0;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#container}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:container
        */
        public static final int Favorite_container = 2;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#icon}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.ibimuyu.android.launcher3:icon
        */
        public static final int Favorite_icon = 8;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#packageName}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:packageName
        */
        public static final int Favorite_packageName = 1;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#screen}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:screen
        */
        public static final int Favorite_screen = 3;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#spanX}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:spanX
        */
        public static final int Favorite_spanX = 6;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#spanY}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:spanY
        */
        public static final int Favorite_spanY = 7;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#title}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.ibimuyu.android.launcher3:title
        */
        public static final int Favorite_title = 9;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#uri}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:uri
        */
        public static final int Favorite_uri = 10;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#x}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:x
        */
        public static final int Favorite_x = 4;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#y}
          attribute's value can be found in the {@link #Favorite} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:y
        */
        public static final int Favorite_y = 5;
        /**  HolographicLinearLayout specific attributes. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #HolographicLinearLayout_sourceImageViewId com.ibimuyu.android.launcher3:sourceImageViewId}</code></td><td> The source view to generate and apply the drawable states to/from </td></tr>
           <tr><td><code>{@link #HolographicLinearLayout_stateHotwordOn com.ibimuyu.android.launcher3:stateHotwordOn}</code></td><td></td></tr>
           </table>
           @see #HolographicLinearLayout_sourceImageViewId
           @see #HolographicLinearLayout_stateHotwordOn
         */
        public static final int[] HolographicLinearLayout = {
            0x7f01000e, 0x7f01000f
        };
        /**
          <p>
          @attr description
           The source view to generate and apply the drawable states to/from 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:sourceImageViewId
        */
        public static final int HolographicLinearLayout_sourceImageViewId = 0;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#stateHotwordOn}
          attribute's value can be found in the {@link #HolographicLinearLayout} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:stateHotwordOn
        */
        public static final int HolographicLinearLayout_stateHotwordOn = 1;
        /**  Hotseat specific attributes. These attributes are used to customize
         the hotseat in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #Hotseat_cellCountX com.ibimuyu.android.launcher3:cellCountX}</code></td><td> The number of horizontal cells in the CellLayout </td></tr>
           <tr><td><code>{@link #Hotseat_cellCountY com.ibimuyu.android.launcher3:cellCountY}</code></td><td> The number of vertical cells in the CellLayout </td></tr>
           </table>
           @see #Hotseat_cellCountX
           @see #Hotseat_cellCountY
         */
        public static final int[] Hotseat = {
            0x7f010004, 0x7f010005
        };
        /**
          <p>
          @attr description
           The number of horizontal cells in the CellLayout 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:cellCountX
        */
        public static final int Hotseat_cellCountX = 0;
        /**
          <p>
          @attr description
           The number of vertical cells in the CellLayout 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:cellCountY
        */
        public static final int Hotseat_cellCountY = 1;
        /** Attributes that can be used with a Include.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #Include_workspace com.ibimuyu.android.launcher3:workspace}</code></td><td></td></tr>
           </table>
           @see #Include_workspace
         */
        public static final int[] Include = {
            0x7f01002d
        };
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#workspace}
          attribute's value can be found in the {@link #Include} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.ibimuyu.android.launcher3:workspace
        */
        public static final int Include_workspace = 0;
        /**  Page Indicator specific attributes. These attributes are used to customize
         the cling in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PageIndicator_windowSize com.ibimuyu.android.launcher3:windowSize}</code></td><td> Used to identify how to draw the cling bg </td></tr>
           </table>
           @see #PageIndicator_windowSize
         */
        public static final int[] PageIndicator = {
            0x7f010002
        };
        /**
          <p>
          @attr description
           Used to identify how to draw the cling bg 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:windowSize
        */
        public static final int PageIndicator_windowSize = 0;
        /**  PagedView specific attributes. These attributes are used to customize
         a PagedView view in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PagedView_pageIndicator com.ibimuyu.android.launcher3:pageIndicator}</code></td><td> The page indicator for this workspace </td></tr>
           <tr><td><code>{@link #PagedView_pageLayoutHeightGap com.ibimuyu.android.launcher3:pageLayoutHeightGap}</code></td><td></td></tr>
           <tr><td><code>{@link #PagedView_pageLayoutPaddingBottom com.ibimuyu.android.launcher3:pageLayoutPaddingBottom}</code></td><td></td></tr>
           <tr><td><code>{@link #PagedView_pageLayoutPaddingLeft com.ibimuyu.android.launcher3:pageLayoutPaddingLeft}</code></td><td></td></tr>
           <tr><td><code>{@link #PagedView_pageLayoutPaddingRight com.ibimuyu.android.launcher3:pageLayoutPaddingRight}</code></td><td></td></tr>
           <tr><td><code>{@link #PagedView_pageLayoutPaddingTop com.ibimuyu.android.launcher3:pageLayoutPaddingTop}</code></td><td> The padding of the pages that are dynamically created per page </td></tr>
           <tr><td><code>{@link #PagedView_pageLayoutWidthGap com.ibimuyu.android.launcher3:pageLayoutWidthGap}</code></td><td> A spacing override for the icons within a page </td></tr>
           <tr><td><code>{@link #PagedView_pageSpacing com.ibimuyu.android.launcher3:pageSpacing}</code></td><td> The space between adjacent pages of the PagedView.</td></tr>
           </table>
           @see #PagedView_pageIndicator
           @see #PagedView_pageLayoutHeightGap
           @see #PagedView_pageLayoutPaddingBottom
           @see #PagedView_pageLayoutPaddingLeft
           @see #PagedView_pageLayoutPaddingRight
           @see #PagedView_pageLayoutPaddingTop
           @see #PagedView_pageLayoutWidthGap
           @see #PagedView_pageSpacing
         */
        public static final int[] PagedView = {
            0x7f010010, 0x7f010011, 0x7f010012, 0x7f010013,
            0x7f010014, 0x7f010015, 0x7f010016, 0x7f010017
        };
        /**
          <p>
          @attr description
           The page indicator for this workspace 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:pageIndicator
        */
        public static final int PagedView_pageIndicator = 7;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#pageLayoutHeightGap}
          attribute's value can be found in the {@link #PagedView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:pageLayoutHeightGap
        */
        public static final int PagedView_pageLayoutHeightGap = 1;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#pageLayoutPaddingBottom}
          attribute's value can be found in the {@link #PagedView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:pageLayoutPaddingBottom
        */
        public static final int PagedView_pageLayoutPaddingBottom = 3;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#pageLayoutPaddingLeft}
          attribute's value can be found in the {@link #PagedView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:pageLayoutPaddingLeft
        */
        public static final int PagedView_pageLayoutPaddingLeft = 4;
        /**
          <p>This symbol is the offset where the {@link com.ibimuyu.android.launcher3.R.attr#pageLayoutPaddingRight}
          attribute's value can be found in the {@link #PagedView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.ibimuyu.android.launcher3:pageLayoutPaddingRight
        */
        public static final int PagedView_pageLayoutPaddingRight = 5;
        /**
          <p>
          @attr description
           The padding of the pages that are dynamically created per page 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:pageLayoutPaddingTop
        */
        public static final int PagedView_pageLayoutPaddingTop = 2;
        /**
          <p>
          @attr description
           A spacing override for the icons within a page 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:pageLayoutWidthGap
        */
        public static final int PagedView_pageLayoutWidthGap = 0;
        /**
          <p>
          @attr description
           The space between adjacent pages of the PagedView. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:pageSpacing
        */
        public static final int PagedView_pageSpacing = 6;
        /**  StrokedTextView specific attributes. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #StrokedTextView_strokeColor com.ibimuyu.android.launcher3:strokeColor}</code></td><td> The color of the stroke outline </td></tr>
           <tr><td><code>{@link #StrokedTextView_strokeTextColor com.ibimuyu.android.launcher3:strokeTextColor}</code></td><td> The color of the text </td></tr>
           <tr><td><code>{@link #StrokedTextView_strokeWidth com.ibimuyu.android.launcher3:strokeWidth}</code></td><td> The width of the stroke </td></tr>
           </table>
           @see #StrokedTextView_strokeColor
           @see #StrokedTextView_strokeTextColor
           @see #StrokedTextView_strokeWidth
         */
        public static final int[] StrokedTextView = {
            0x7f01000b, 0x7f01000c, 0x7f01000d
        };
        /**
          <p>
          @attr description
           The color of the stroke outline 


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:strokeColor
        */
        public static final int StrokedTextView_strokeColor = 0;
        /**
          <p>
          @attr description
           The color of the text 


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:strokeTextColor
        */
        public static final int StrokedTextView_strokeTextColor = 1;
        /**
          <p>
          @attr description
           The width of the stroke 


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:strokeWidth
        */
        public static final int StrokedTextView_strokeWidth = 2;
        /**  Workspace specific attributes. These attributes are used to customize
         the workspace in XML files. 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #Workspace_cellCountX com.ibimuyu.android.launcher3:cellCountX}</code></td><td> The number of horizontal cells in the CellLayout </td></tr>
           <tr><td><code>{@link #Workspace_cellCountY com.ibimuyu.android.launcher3:cellCountY}</code></td><td> The number of vertical cells in the CellLayout </td></tr>
           <tr><td><code>{@link #Workspace_defaultScreen com.ibimuyu.android.launcher3:defaultScreen}</code></td><td> The first screen the workspace should display.</td></tr>
           </table>
           @see #Workspace_cellCountX
           @see #Workspace_cellCountY
           @see #Workspace_defaultScreen
         */
        public static final int[] Workspace = {
            0x7f010003, 0x7f010004, 0x7f010005
        };
        /**
          <p>
          @attr description
           The number of horizontal cells in the CellLayout 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:cellCountX
        */
        public static final int Workspace_cellCountX = 1;
        /**
          <p>
          @attr description
           The number of vertical cells in the CellLayout 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:cellCountY
        */
        public static final int Workspace_cellCountY = 2;
        /**
          <p>
          @attr description
           The first screen the workspace should display. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ibimuyu.android.launcher3:defaultScreen
        */
        public static final int Workspace_defaultScreen = 0;
    };
}
