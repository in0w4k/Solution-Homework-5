## Proxy Pattern

### What problem was solved?
In an image management system for real estate, the issue is that high-resolution images take too long to load. The solution is to show low-res images first, and only load high-res images when the user asks for them.

### How did the pattern simplify or optimize the design?
The **Proxy Pattern** helps by using low-res images as thumbnails. When the user clicks to zoom, the high-res image is loaded.

---

## Flyweight Pattern

### What problem was solved?
In a map app, there are markers (e.g., shop, museum, hospitals), but part of them share the same styles (icon, color, label). Storing each style separately takes up too much memory.

### How did the pattern simplify or optimize the design?
The **Flyweight Pattern** makes it possible to share common styles between markers. Instead of each marker storing its own style, many markers use the same style, saving a lot of memory.
