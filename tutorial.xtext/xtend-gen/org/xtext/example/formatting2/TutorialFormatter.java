/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.services.TutorialGrammarAccess;
import tutorial.BasicItemType;
import tutorial.Color;
import tutorial.Factory;
import tutorial.ItemType;
import tutorial.Marker;
import tutorial.Shape;

@SuppressWarnings("all")
public class TutorialFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private TutorialGrammarAccess _tutorialGrammarAccess;

  protected void _format(final Factory factory, @Extension final IFormattableDocument document) {
    EList<ItemType> _itemTypes = factory.getItemTypes();
    for (final ItemType itemType : _itemTypes) {
      document.<ItemType>format(itemType);
    }
  }

  protected void _format(final BasicItemType basicItemType, @Extension final IFormattableDocument document) {
    document.<Shape>format(basicItemType.getShape());
    document.<Color>format(basicItemType.getColor());
    EList<Marker> _markers = basicItemType.getMarkers();
    for (final Marker marker : _markers) {
      document.<Marker>format(marker);
    }
  }

  public void format(final Object basicItemType, final IFormattableDocument document) {
    if (basicItemType instanceof XtextResource) {
      _format((XtextResource)basicItemType, document);
      return;
    } else if (basicItemType instanceof BasicItemType) {
      _format((BasicItemType)basicItemType, document);
      return;
    } else if (basicItemType instanceof Factory) {
      _format((Factory)basicItemType, document);
      return;
    } else if (basicItemType instanceof EObject) {
      _format((EObject)basicItemType, document);
      return;
    } else if (basicItemType == null) {
      _format((Void)null, document);
      return;
    } else if (basicItemType != null) {
      _format(basicItemType, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(basicItemType, document).toString());
    }
  }
}
